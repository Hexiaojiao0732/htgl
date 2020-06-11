package com.zhixin.rd.rkjc.web.common;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

public class WebServiceUtil {

    //获取登录后的tgc值
    public static String getLoginTgc() {
        String endpoint = "http://172.16.5.50/cms/services/IAuthService?wsdl";
        String result = "no result!";
        Service service = new Service();
        Call call;
        //Object是用来存储方法的参数
        Object[] object = new Object[3];
        object[0] = "zhixinrd";//用户名
        object[1] = "b0036572283d13050cf75be445796b1d8557df27c1258a5e21e9591aaa0441a4";//哈希256加密值（zhixinrd_123）
        object[2] = "172.16.5.50";//当前访问的平台ip
        try {
            call = (Call) service.createCall();
            call.setTargetEndpointAddress(endpoint);// 远程调用路径
            call.setOperationName(new QName("http://ws.cms.ivms6.hikvision.com", "login"));// 调用的方法名

            // 设置参数名:
            call.addParameter("loginAccount", XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter("password", XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter("serviceIp", XMLType.XSD_STRING, ParameterMode.IN);

            // 设置返回值类型：
            call.setReturnType(XMLType.XSD_STRING);// 返回值类型：String

            result = (String) call.invoke(object);// 远程调用
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return result;
    }

    //获取Token值
    public static String getToken(String tgc) {
        String endpoint = "http://172.16.5.50/cms/services/IAuthService?wsdl";
        String result = "no result!";
        Service service = new Service();
        Call call;
        //Object是用来存储方法的参数
        Object[] object = new Object[1];
        object[0] = tgc;//tgc值
        try {
            call = (Call) service.createCall();
            call.setTargetEndpointAddress(endpoint);// 远程调用路径
            call.setOperationName(new QName("http://ws.cms.ivms6.hikvision.com", "applyToken"));// 调用的方法名

            // 设置参数名:
            call.addParameter("tgt", XMLType.XSD_STRING, ParameterMode.IN);

            // 设置返回值类型：
            call.setReturnType(XMLType.XSD_STRING);// 返回值类型：String

            result = (String) call.invoke(object);// 远程调用
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return result;
    }

    //获取播放xml数据
    public static String getPlayXmlData(String cameraNum, String beginTimeStr, String endTimeStr) {
        String endpoint = "http://172.16.5.50/vms/services/VmsSdkService?wsdl";
        String result = "no result!";
        Service service = new Service();
        Call call;
        //Object是用来存储方法的参数
        Object[] object = new Object[7];
        object[0] = cameraNum;//监控点编号
        object[1] = "1";//用户id 默认填1
        object[2] = "172.16.5.50";//当前访问的平台ip
        object[3] = beginTimeStr;//开始时间
        object[4] = endTimeStr;//结束时间
        object[5] = "0";//本地存储57，中心存储0
        object[6] = "10000000000000000014";//vmcc节点编号
        try {
            call = (Call) service.createCall();
            call.setTargetEndpointAddress(endpoint);// 远程调用路径
            call.setOperationName(new QName("http://ws.vms.ivms6.hikvision.com", "getPlaybackOcxOptions"));// 调用的方法名

            // 设置参数名:
            call.addParameter("cameraIndexCode", XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter("userId", XMLType.XSD_LONG, ParameterMode.IN);
            call.addParameter("clientIp", XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter("beginTime", XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter("endTime", XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter("storeDeviceType", XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter("srcIndexCode", XMLType.XSD_STRING, ParameterMode.IN);

            // 设置返回值类型：
            call.setReturnType(XMLType.XSD_STRING);// 返回值类型：String

            result = (String) call.invoke(object);// 远程调用
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        String tgc = getLoginTgc();
        System.out.println("========tgc===========解析前为："+tgc);
        tgc = tgc.substring(tgc.indexOf("tgc=\"")+5, tgc.indexOf("\" tag="));
        System.out.println("========tgc===========解析后为："+tgc);

        String token = getToken(tgc);
        System.out.println("=========token==========解析前为："+token);
        token = token.substring(token.indexOf("st=\"")+4, token.indexOf("\" tag="));
        System.out.println("=========token==========解析后为："+token);

        System.out.println("===============xml data=======================");
    }
}
