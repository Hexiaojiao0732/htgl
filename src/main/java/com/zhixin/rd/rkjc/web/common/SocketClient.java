package com.zhixin.rd.rkjc.web.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {

	/** socket connection */
	private Socket connection = null;
	/** socket inputStream */
	private BufferedReader income = null;
	/** socket outputStream */
	private PrintWriter outgo = null;

	public void connect(String host, int port) throws Exception {
		connection = new Socket(host, port);
		// connection.setReceiveBufferSize(1048576);
		// connection.setSendBufferSize(1048576);
		connection.setSoTimeout(3000);
		connection.setKeepAlive(true);
		income = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		outgo = new PrintWriter(new OutputStreamWriter(connection.getOutputStream()));
	}

	/**
	 * send message to server.
	 * 
	 * @param object
	 * @throws IOException
	 */
	public void printlnUTF(String data) throws Exception {
		if (data != null) {
			this.outgo.println(data);
			this.outgo.flush();
			// this.outgo.writeUTF(data);
			// this.outgo.flush();
		}
	}

	/**
	 * read message from server.
	 * 
	 * @return
	 * @throws IOException
	 */
	public String readLineUTF() throws Exception {
		return this.income.readLine();
		// return this.income.readUTF();
	}

	public static void main(String[] args) {
		try {
			SocketClient client = new SocketClient();
			client.connect("127.0.0.1", 5555);
			client.printlnUTF("hello!");
			System.out.println("read form socket server[" + client.readLineUTF() + "]");
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

}
