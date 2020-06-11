/**
 * QueryTableImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zhixin.rd.rkjc.ws;

public class QueryTableImplServiceLocator extends org.apache.axis.client.Service
		implements com.zhixin.rd.rkjc.ws.QueryTableImplService {

	public QueryTableImplServiceLocator() {
	}

	public QueryTableImplServiceLocator(String address,String namespaceUri) {
		this.Query_BJ_address = address;
		this.namespaceUri = namespaceUri;
	}
	public QueryTableImplServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public QueryTableImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}
	
	// Use to get a proxy class for Query_BJ
	private String Query_BJ_address = "http://10.8.6.13/rsServer/services/Query_BJ";

	private String namespaceUri = "http://10.8.6.13/rsServer/services/Query_BJ";

	public java.lang.String getQuery_BJAddress() {
		return Query_BJ_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String Query_BJWSDDServiceName = "Query_BJ";

	public java.lang.String getQuery_BJWSDDServiceName() {
		return Query_BJWSDDServiceName;
	}

	public void setQuery_BJWSDDServiceName(java.lang.String name) {
		Query_BJWSDDServiceName = name;
	}

	public com.zhixin.rd.rkjc.ws.QueryTableImpl getQuery_BJ() throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(Query_BJ_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getQuery_BJ(endpoint);
	}

	public com.zhixin.rd.rkjc.ws.QueryTableImpl getQuery_BJ(java.net.URL portAddress)
			throws javax.xml.rpc.ServiceException {
		try {
			com.zhixin.rd.rkjc.ws.QueryBjSoapBindingStub _stub = new com.zhixin.rd.rkjc.ws.QueryBjSoapBindingStub(
					portAddress, this);
			_stub.setPortName(getQuery_BJWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}
	public com.zhixin.rd.rkjc.ws.QueryTableImpl getQuery_BJ(String address,String namespaceUri,String portName)
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		try {
			com.zhixin.rd.rkjc.ws.QueryBjSoapBindingStub _stub = new com.zhixin.rd.rkjc.ws.QueryBjSoapBindingStub(
					endpoint, this);
			_stub.setPortName(portName);
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}
	public void setQuery_BJEndpointAddress(java.lang.String address) {
		Query_BJ_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		try {
			if (com.zhixin.rd.rkjc.ws.QueryTableImpl.class.isAssignableFrom(serviceEndpointInterface)) {
				com.zhixin.rd.rkjc.ws.QueryBjSoapBindingStub _stub = new com.zhixin.rd.rkjc.ws.QueryBjSoapBindingStub(
						new java.net.URL(Query_BJ_address), this);
				_stub.setPortName(getQuery_BJWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  "
				+ (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("Query_BJ".equals(inputPortName)) {
			return getQuery_BJ();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName(namespaceUri, "QueryTableImplService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName(namespaceUri, "Query_BJ"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName, java.lang.String address)
			throws javax.xml.rpc.ServiceException {

		if ("Query_BJ".equals(portName)) {
			setQuery_BJEndpointAddress(address);
		} else { // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address)
			throws javax.xml.rpc.ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
