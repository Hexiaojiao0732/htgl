package com.zhixin.rd.rkjc.ws;

public interface BjQueryPerson {
	
	/**
	 * 
	 * @param senderID 请求方ID
	 * @param serviceID 目标服务方ID
	 * @param endUser 请求用户信息{用户姓名, 用户身份号码,用户所在单位,用户数字证书编号}
	 * @param dataObjectCode 共享数据项集代码,如：A001代表常住人口；A002代表暂住人口。
	 * @param condition 信息查询条件
	 * @param requiredItems 返回结果数据项集,要求返回结果上具有的数据项，为一维数组表示的数据项标记；为空，则请服务方返回查询数据集上的全部数据项；如 {“XM”,”XB”}
	 * @param infoCodeMode 信息代码输出模式,{0:输出相应的信息代码值,1:输出相应的信息代码所对应的名称,2:输出相应信息代码的代码值、代码名称，格式为“代码值/代码名称”}
	 * @return
	 * @throws Exception
	 */
	public String[][] query(String senderID, String serviceID,
			String[] endUser, String dataObjectCode, String condition,
			String[] requiredItems, String infoCodeMode)throws Exception;
	
	

}
