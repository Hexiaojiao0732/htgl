package com.zhixin.rd.rkjc.web.common;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class UserIpInterceptor extends HandlerInterceptorAdapter {

	private static final Logger logger = LoggerFactory.getLogger(UserIpInterceptor.class);
	
	private static final String loaclhost="127.0.0.1";
	
//	@Autowired
//	private IpFilterService ipFilterService = null;
//

//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//    	logger.info("UserIpInterceptor");
//        boolean flag = false;
//        String ip=getRemoteHost(request);
//        if(loaclhost.equals(ip)){
//        	flag = true;
//        }else{
//        	List<IpFilterEntity> ipList= ipFilterService.getCacheIpList();
//        	if(ipList!=null && !ipList.isEmpty() )
//        	{
//        		boolean isblack=false;
//        		boolean iswhite=false;
//
//        		for(IpFilterEntity ipfilt:ipList){
//        			int check=checkIp(ip,ipfilt.getIp());
//
//        			if(check==1){
//        				if(ipfilt.getStatus()==1)
//        				{
//        					//先看黑名单 可直接跳出
//        					isblack=true;
//        					break;
//        				}else{
//        					iswhite=true;
//        					//白名单弱于黑名单，不跳出
//        				}
//        			}
//
//        		}
//        		if(isblack)
//        		{
//        			flag=false;
//        		}else if(iswhite)
//        		{
//        			flag=true;
//        		}
//        	}else{
//        		//空的默认通过
//        		flag = true;
//        	}
//        }
//        logger.info("ip:"+ip+",flag:"+flag);
//        return flag;
//    }
    
    /**
     * 0 不过，1 通过，2 ruleIp不合法，跳过
     * @param ip
     * @param ruleIp
     * @return
     */
    public int checkIp(String ip,String ruleIp){
    	if(ruleIp==null)
    	{
    		return 0;
    	}if(ip!=null )
    	{
    		String ipa[]=ip.split("\\.");
    		String ipb[]=ruleIp.split("\\.");
    		if(ipa.length==4)
    		{
    			if(ipb.length!=4){
    				return 2;
    			}
    			if( isInGoodRule(ipa[0],ipb[0])  && isInGoodRule(ipa[1],ipb[1]) 
    					&& isInGoodRule(ipa[2],ipb[2]) && isInGoodRule(ipa[3],ipb[3])){
    				return 1;
    			}
    		}
    		
    	}
    	return 0;
    }
    
    /**
     * ip 解析，s一定为数字，t 为数字或者星号
     * @param s
     * @param t
     * @return
     */
    private boolean isInGoodRule(String s,String t){
    	if("*".equals(t))
    	{
    		return true;
    	}else{
    		int s1=Integer.valueOf(s);
    		int t1=Integer.valueOf(t);
    		if(s1==t1)
    		{
    			return true;
    		}
    		return false;
    	}
    }
    

	private String getRemoteHost(HttpServletRequest request) {
		String ip = request.getHeader("X-Real-IP");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("x-forwarded-for");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip.equals("0:0:0:0:0:0:0:1") ? loaclhost : ip;
	}
	
	
	public static void main(String arg[]){
		UserIpInterceptor u=new UserIpInterceptor();
		int i=u.checkIp("127.0.0.1", "127.*.*.1");
		System.out.println(i);
	}

}
