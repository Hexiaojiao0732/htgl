package com.zhixin.rd.rkjc.web.common;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import org.apache.poi.ss.formula.functions.T;

public class JsonUtils {

	/**
	 * 封装将json对象转换为java集合对象
	 * 
	 * @param <T>
	 * @param clazz
	 * @param jsons
	 * @return
	 */
	public static <T> List<T> getJavaCollection(T clazz, String jsons) {
		List<T> objs = null;
		JSONArray jsonArray = (JSONArray) JSONSerializer.toJSON(jsons);
		if (jsonArray != null) {
			objs = new ArrayList<T>();
			List list = (List) JSONSerializer.toJava(jsonArray);
			for (Object o : list) {
				JSONObject jsonObject = JSONObject.fromObject(o);
				T obj = (T) JSONObject.toBean(jsonObject, clazz.getClass());
				objs.add(obj);
			}
		}
		return objs;
	}

	/**
	 * 封装将json对象转换为java对象
	 *
	 * @param <T>
	 * @param clazz
	 * @param jsons
	 * @return
	 */
	public static T getJavaObject(T clazz, String jsons) {
		JSONObject jsonObject = JSONObject.fromObject(jsons);
		return (T) JSONObject.toBean(jsonObject, clazz.getClass());
	}

	public static void main(String[] args) {
		String jsonStr = "{\"token\":1,\"rownum\":1,\"algorithm\":\"哈哈\",\"sfzh\":\"1111111111111111111\",\"tagname\":\"ry_wffzjl\"}";
		JSONObject obj = (JSONObject) JSONSerializer.toJSON(jsonStr);
		System.out.println(obj.get("token"));
	}
}
