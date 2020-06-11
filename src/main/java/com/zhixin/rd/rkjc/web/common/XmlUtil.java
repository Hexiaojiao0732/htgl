package com.zhixin.rd.rkjc.web.common;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlUtil {
	/**
	 * @description 将xml字符串转换成map
	 * @param xml
	 * 
	 * @return Map
	 * 
	 */

	public static Map readStringXmlOut(String xml) {

		Map map = new HashMap();

		Document doc = null;

		try {

			doc = DocumentHelper.parseText(xml); // 将字符串转为XML

			Element rootElt = doc.getRootElement(); // 获取根节点

			System.out.println("根节点：" + rootElt.getName()); // 拿到根节点的名称

			Iterator iter = rootElt.elementIterator("head"); // 获取根节点下的子节点head

			// 遍历head节点

			while (iter.hasNext()) {

				Element recordEle = (Element) iter.next();

				String title = recordEle.elementTextTrim("title"); // 拿到head节点下的子节点title值

				System.out.println("title:" + title);

				map.put("title", title);

				Iterator iters = recordEle.elementIterator("script"); // 获取子节点head下的子节点script

				// 遍历Header节点下的Response节点

				while (iters.hasNext()) {

					Element itemEle = (Element) iters.next();

					String username = itemEle.elementTextTrim("username"); // 拿到head下的子节点script下的字节点username的值

					String password = itemEle.elementTextTrim("password");

					System.out.println("username:" + username);

					System.out.println("password:" + password);

					map.put("username", username);

					map.put("password", password);

				}

			}

			Iterator iterss = rootElt.elementIterator("body"); /// 获取根节点下的子节点body

			// 遍历body节点

			while (iterss.hasNext()) {

				Element recordEless = (Element) iterss.next();

				String result = recordEless.elementTextTrim("result"); // 拿到body节点下的子节点result值

				System.out.println("result:" + result);

				Iterator itersElIterator = recordEless.elementIterator("form"); // 获取子节点body下的子节点form

				// 遍历Header节点下的Response节点

				while (itersElIterator.hasNext()) {

					Element itemEle = (Element) itersElIterator.next();

					String banlce = itemEle.elementTextTrim("banlce"); // 拿到body下的子节点form下的字节点banlce的值

					String subID = itemEle.elementTextTrim("subID");

					System.out.println("banlce:" + banlce);

					System.out.println("subID:" + subID);

					map.put("result", result);

					map.put("banlce", banlce);

					map.put("subID", subID);

				}

			}

		} catch (DocumentException e) {

			e.printStackTrace();

		} catch (Exception e) {

			e.printStackTrace();

		}

		return map;

	}

	/**
	 * 获取xml 节点 Attribute 名称，值
	 * 
	 * @param xmlStr
	 *            xml字符串
	 * 
	 * @return
	 */
	public static Map<String, Object> parseXMLGetAttribute(String xmlStr) {

		SAXReader reader = new SAXReader();

		Document xml_document;
		Element xml_element;
		
		Map<String, Object> rootNodeMap = new HashMap<>();// 根节点;
		
		try {
			xml_document = reader.read(new ByteArrayInputStream(xmlStr.getBytes()));
			Element root_element = xml_document.getRootElement();// 根节点 <table>

			if (root_element != null) {
				Iterator<Element> root_it = root_element.elementIterator();

				List<Object> parentNodeList;
				
				Map<String, Object> childNodeMap;
				while (root_it.hasNext()) {
					//根节点下面的 父节点  <table> --><head>
					Element rootElement = root_it.next();//// <head>
					
					System.out.println(rootElement.getName());

					Iterator<Element> childNode = rootElement.elementIterator();
					parentNodeList = new ArrayList<>();
					while (childNode.hasNext()) {

						childNodeMap = new HashMap<>();// 子节点

						// 获取节点 <result>
						Element childElement = childNode.next();
						System.out.println(childElement.getName());

						for (int i = 0; i < childElement.attributeCount(); i++) {
							childNodeMap.put(childElement.attribute(i).getName(), childElement.attribute(i).getValue());
						}
						parentNodeList.add(childNodeMap);

					}
					rootNodeMap.put(rootElement.getName(), parentNodeList);

				}			
			}

		} catch (DocumentException e)
		{
			e.printStackTrace();
		}

		return rootNodeMap;

	}
	
	
	/*
	 * 获取节点值
	 * <root>
			<head>
				<errorCode>111</errorCode>
				<result>222</result>
			</head>
			<body>
				<item>
					<sessionId>33</sessionId>
				</item>
			</body>
		</root>
	 * */
	public static Map<String, Object> parseXMLGetValue(String xmlStr) {
	
		Map<String, Object> nodeMap = new HashMap<>();
		SAXReader reader = new SAXReader();
		Document xml_document;
		try {
			xml_document = reader.read(new ByteArrayInputStream(xmlStr.getBytes()));
			Element root_element = xml_document.getRootElement();//root
			
			if (root_element != null) {
				Iterator<Element> root_it = root_element.elementIterator();
				
				while (root_it.hasNext()) {
					Element rootElement = root_it.next();//<head>
					Iterator<Element> childNode = rootElement.elementIterator();
					while (childNode.hasNext()) {
						
						Element childElement = childNode.next();//errorCode

						Iterator<Element> secondChildNode = childElement.elementIterator();
						
						while (secondChildNode.hasNext()) {
							
							Element element = secondChildNode.next();
							
							nodeMap.put(element.getName(), element.getStringValue());
						}
						
						nodeMap.put(childElement.getName(), childElement.getStringValue());	

					}
				}
			}
		} catch (Exception e) {
			
		}
		
		return nodeMap;
		
	}

	public static void main(String[] args) {
		System.out.println("--------------" + parseXMLGetAttribute("<?xml version=\"1.0\" encoding=\"UTF-8\" ?><table>\n"
				+ "<head>\n" + "<result type=\"st\" result_code=\"0\" message=\"成功\" size=\"1\" />\n" + "</head>\n"
				+ "<rows>\n" + "<row st=\"ST-1529-CePicFlNduogSoIc1LRV-cas\" tag=\"st\"  />\n" + "</rows>\n"
				+ "</table>"));
	}

}
