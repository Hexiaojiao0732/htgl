/**
 * QueryTableImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zhixin.rd.rkjc.ws;

public interface QueryTableImpl extends java.rmi.Remote {
	public java.lang.String[][] query_BJ(java.lang.String senderID, java.lang.String serviceID,
			java.lang.String[] endUser, java.lang.String dataObjectCode, java.lang.String condition,
			java.lang.String[] requiredItems, java.lang.String infoCodeMode) throws java.rmi.RemoteException;
}
