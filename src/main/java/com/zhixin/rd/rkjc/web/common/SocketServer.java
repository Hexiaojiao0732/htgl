package com.zhixin.rd.rkjc.web.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SocketServer {

	/** socket server */
	private ServerSocket server = null;
	private String svrhost = "10.11.229.226";
	private int svrport = 1002;
	private boolean isActive = true;

	public SocketServer() throws Exception {
		server = new ServerSocket();
		server.bind(new InetSocketAddress(svrhost, svrport));
		new Accepter().start();
		System.out.println("Server is running!");
	}

	private class Accepter extends Thread {

		public Accepter() {
			super("SocketServer.Accepter");
		}

		public void run() {
			try {
				while (isActive) {
					try {
						Socket socket = server.accept();
						System.out.println("Server accept a socket!");
						// socket.setReceiveBufferSize(1048576);
						// socket.setSendBufferSize(1048576);
						new Connection(socket).start();
					} catch (Exception e) {
						e.printStackTrace(System.out);
					}
				}
			} catch (Exception e) {
				e.printStackTrace(System.out);
			}
		}

	}

	private class Connection extends Thread {
		private Socket socket = null;
		private boolean isDisconnect = false;
		/** socket inputStream */
		private BufferedReader income = null;
		/** socket outputStream */
		private PrintWriter outgo = null;
		private String connectionName = null;

		public Connection(Socket socket) {
			// set thread name
			super("Connection.Connection." + System.currentTimeMillis());

			try {
				this.socket = socket;
				this.socket.setSoTimeout(3000);
				this.socket.setKeepAlive(true);
				this.income = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
				this.outgo = new PrintWriter(new OutputStreamWriter(this.socket.getOutputStream()));
				this.connectionName = this.socket.getInetAddress().getHostName() + ":" + this.socket.getPort();
				System.out.println(connectionName + " is connecting!");
			} catch (Exception e) {
				e.printStackTrace(System.out);
				this.close();
			}
		}

		public void run() {
			try {
				String cmd = null;
				while ((cmd = readLineUTF()) != null) {
					try {
						System.out.println("form client:"+cmd);
						printlnUTF("send date:" + new Date());
					} catch (Exception e) {
						e.printStackTrace(System.out);
						this.close();
					}
					if (isDisconnect) {
						break;
					}
				} // end while
				this.close();
			} catch (Exception e) {
				e.printStackTrace(System.out);
				this.close();
			}
		}

		private void printlnUTF(Object object) throws Exception {
			if (object != null) {
				this.outgo.println(object.toString());
				this.outgo.flush();
				// this.outgo.writeUTF(object.toString());
				// this.outgo.flush();
			}
		}

		private String readLineUTF() throws Exception {
			// return this.income.readUTF();
			return this.income.readLine();
		}

		private void close() {
			try {
				if (this.income != null) {
					this.income.close();
					this.income = null;
				}
			} catch (Exception e) {
				e.printStackTrace(System.out);
			}
			try {
				if (this.outgo != null) {
					this.outgo.close();
					this.outgo = null;
				}
			} catch (Exception e) {
				e.printStackTrace(System.out);
			}
			try {
				if (this.socket != null) {
					this.socket.close();
					this.socket = null;
				}
			} catch (Exception e) {
				e.printStackTrace(System.out);
			}
			this.connectionName = null;
		}// close

	}// Connection

	public static void main(String[] args) {
		try {
			new SocketServer();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

}
