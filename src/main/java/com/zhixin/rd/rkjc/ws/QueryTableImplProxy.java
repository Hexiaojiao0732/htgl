package com.zhixin.rd.rkjc.ws;

public class QueryTableImplProxy implements com.zhixin.rd.rkjc.ws.QueryTableImpl {
	private String _endpoint = null;
	private com.zhixin.rd.rkjc.ws.QueryTableImpl queryTableImpl = null;

	public QueryTableImplProxy() {
		_initQueryTableImplProxy();
	}

	public QueryTableImplProxy(String endpoint) {
		_endpoint = endpoint;
		_initQueryTableImplProxy();
	}

	private void _initQueryTableImplProxy() {
		try {
			queryTableImpl = (new com.zhixin.rd.rkjc.ws.QueryTableImplServiceLocator()).getQuery_BJ();
			if (queryTableImpl != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) queryTableImpl)._setProperty("javax.xml.rpc.service.endpoint.address",
							_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) queryTableImpl)
							._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		} catch (javax.xml.rpc.ServiceException serviceException) {
		}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (queryTableImpl != null)
			((javax.xml.rpc.Stub) queryTableImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public com.zhixin.rd.rkjc.ws.QueryTableImpl getQueryTableImpl() {
		if (queryTableImpl == null)
			_initQueryTableImplProxy();
		return queryTableImpl;
	}

	public java.lang.String[][] query_BJ(java.lang.String senderID, java.lang.String serviceID,
			java.lang.String[] endUser, java.lang.String dataObjectCode, java.lang.String condition,
			java.lang.String[] requiredItems, java.lang.String infoCodeMode) throws java.rmi.RemoteException {
		if (queryTableImpl == null)
			_initQueryTableImplProxy();
		return queryTableImpl.query_BJ(senderID, serviceID, endUser, dataObjectCode, condition, requiredItems,
				infoCodeMode);
	}

}