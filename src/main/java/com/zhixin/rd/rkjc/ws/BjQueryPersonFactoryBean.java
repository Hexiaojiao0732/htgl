/**
 * 
 */
package com.zhixin.rd.rkjc.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author zhiqiang
 *
 */
public class BjQueryPersonFactoryBean implements BjQueryPerson, InitializingBean, FactoryBean<BjQueryPerson> {
	
	

	private QueryTableImpl instance;

	private Logger logger = LoggerFactory.getLogger(getClass());
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	public void afterPropertiesSet() throws Exception {
		if (null == this.address || null == this.namespaceUri){
			logger.debug("属性address或namespaceUri为空，使用默认设置！");
			this.instance = new QueryTableImplServiceLocator().getQuery_BJ();
			return;
		}
		this.instance = new QueryTableImplServiceLocator(this.address, this.namespaceUri).getQuery_BJ(this.address,
				this.namespaceUri, this.portName);
	}

	public BjQueryPerson getObject() throws Exception {
		return this;
	}

	public Class<?> getObjectType() {
		return BjQueryPerson.class;
	}

	public boolean isSingleton() {
		return true;
	}

	/**
	 * service地址
	 */
	private String address;

	/**
	 * targetNamespace
	 */
	private String namespaceUri;
	/**
	 * wsdl中的portName,一般在如下位置的Query_BJ：
	 * &lt;code&gt;
	 * &lt;wsdl:service name="QueryTableImplService"&gt;
	&lt;wsdl:port binding="impl:Query_BJSoapBinding" name="Query_BJ"&gt;
		&lt;wsdlsoap:address location="http://10.8.6.13/rsServer/services/Query_BJ"/&gt;
	&lt;/wsdl:port&gt;
	&lt;/wsdl:service&gt;&lt;/code&gt;
	 *
	 * portName
	 */
	private String portName;
	
	
	
	public String[][] query(String senderID, String serviceID, String[] endUser, String dataObjectCode,
			String condition, String[] requiredItems, String infoCodeMode) throws Exception {
		return this.instance.query_BJ(senderID, serviceID, endUser, dataObjectCode, condition, requiredItems,
				infoCodeMode);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNamespaceUri() {
		return namespaceUri;
	}

	public void setNamespaceUri(String namespaceUri) {
		this.namespaceUri = namespaceUri;
	}

	public String getPortName() {
		return portName;
	}

	public void setPortName(String portName) {
		this.portName = portName;
	}

}
