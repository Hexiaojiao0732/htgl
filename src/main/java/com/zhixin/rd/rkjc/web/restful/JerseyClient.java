package com.zhixin.rd.rkjc.web.restful;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.zhixin.rd.rkjc.web.common.HttpClientUtil;

import java.io.*;

public class JerseyClient {

	private static ClientConfig createClientConfig() {
		ClientConfig clientConfig = new DefaultClientConfig();
		// for json support
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		// for json support
		clientConfig.getClasses().add(JacksonJsonProvider.class);
		return clientConfig;
	}

	public static void testTagRestful(){
		JSONObject json = new JSONObject();
		//{tableName:szry,colunms:"a,b,c",,count:"1,2",sfzh:xxxx}
		json.put("tableName", "szry");
		json.put("colunms", "C_XM,C_DJR,C_HJSZD");
		json.put("count", "2");
		json.put("sfzh", "513525198207275559");
System.out.print(json.toString());

		try {
			String resutl = HttpClientUtil.faceImgInput("http://127.0.0.1:8081/henan-population-web/restful/tag/queryTagInfo", json.toString());
			System.out.println("----------------"+resutl);
			JSONObject paramObj = (JSONObject) JSONSerializer.toJSON(resutl);
//			System.out.println(paramObj.get("data"));
//			System.out.println(toByteArray(paramObj.get("data")));
//			System.out.println(AESUtil.decrypt(data, "1"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		testTagRestful();
	}

	/**
	 * 对象转数组
	 * @param obj
	 * @return
	 */
	public static byte[] toByteArray (Object obj) {
		byte[] bytes = null;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(obj);
			oos.flush();
			bytes = bos.toByteArray ();
			oos.close();
			bos.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return bytes;
	}

	/**
	 * 数组转对象
	 * @param bytes
	 * @return
	 */
	public Object toObject (byte[] bytes) {
		Object obj = null;
		try {
			ByteArrayInputStream bis = new ByteArrayInputStream (bytes);
			ObjectInputStream ois = new ObjectInputStream (bis);
			obj = ois.readObject();
			ois.close();
			bis.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		return obj;
	}


}
