package com.zhixin.rd.rkjc.web.common;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


//import rtx.RTXSvrApi;

public class RTXUtil {
	private static final Logger logger = LoggerFactory.getLogger(RTXUtil.class);
    //新增部门
//    public static boolean addDept(RTXDeptEntity dept){
//        int iRet = -1;
//
//        RTXSvrApi rtxSvrApi = new RTXSvrApi();
//        if( rtxSvrApi.Init()){
//            iRet = rtxSvrApi.addDept(dept.getDeptId(),dept.getDetpInfo(),dept.getDeptName(),dept.getParentDeptId());
//        }
//        rtxSvrApi.UnInit();
//        return iRet == 0;
//    }
//
//    //修改部门
//    public static boolean editDept(RTXDeptEntity dept){
//        int iRet = -1;
//
//        RTXSvrApi  rtxSvrApi = new RTXSvrApi();
//        if( rtxSvrApi.Init()){
//            iRet = rtxSvrApi.setDept(dept.getDeptId(), dept.getDetpInfo(), dept.getDeptName(), dept.getParentDeptId());
//        }
//        rtxSvrApi.UnInit();
//        return iRet == 0;
//    }
//
//    /**
//     * 删除部门
//     * @param deptId String	部门
//     * @param type String 0:只删除当前组织 1:删除下级组织及用户
//     * @return
//     */
//    public static boolean deleltDept(String deptId, String  type){
//        int iRet = -1;
//
//        RTXSvrApi  rtxSvrApi = new RTXSvrApi();
//        if( rtxSvrApi.Init())
//        {
//            iRet = rtxSvrApi.deleteDept(deptId, type);
//        }
//        rtxSvrApi.UnInit();
//        return iRet == 0;
//    }
//
//    public static boolean isExistDept(String deptId){
//        int iRet = -1;
//        RTXSvrApi  RtxsvrapiObj = new RTXSvrApi();
//        if( RtxsvrapiObj.Init()){
//            iRet = RtxsvrapiObj.deptIsExist(deptId);
//        }
//        RtxsvrapiObj.UnInit();
//        return iRet == 0;
//    }
//
//    //添加用户
//    public static boolean addUser(RTXUserEntity user){
//        int iRet = -1;
//
//        RTXSvrApi  rtxSvrApi = new RTXSvrApi();
//        if( rtxSvrApi.Init()){
//            iRet =rtxSvrApi.addUser(user.getUserName(),user.getDeptID(),user.getChsName(),user.getPwd());
//        }
//        rtxSvrApi.UnInit();
//        return iRet == 0;
//    }
//
//    //修改用户信息
//    public static boolean editUser(RTXUserEntity user){
//        int iRet = -1;
//
//        RTXSvrApi  rtxSvrApi = new RTXSvrApi();
//        if( rtxSvrApi.Init())
//        {
//            iRet =rtxSvrApi.SetUserSimpleInfoEx(user.getUserName(),user.getDeptID(),user.getChsName(),user.getEmail(),user.getGender()
//                    ,user.getMobile(),user.getPhone(),user.getPwd());
//        }
//        rtxSvrApi.UnInit();
//        return iRet == 0;
//    }
//
//    //删除用户
//    public static boolean deleteUser(String userName){
//        int iRet = -1;
//        RTXSvrApi  rtxSvrApi = new RTXSvrApi();
//        if( rtxSvrApi.Init())
//        {
//            iRet =rtxSvrApi.deleteUser(userName);
//        }
//        rtxSvrApi.UnInit();
//        return iRet == 0;
//    }
//
//    public static boolean isExistUser(String userName){
//        int iRet = -1;
//        RTXSvrApi  RtxsvrapiObj = new RTXSvrApi();
//        if( RtxsvrapiObj.Init()){
//        	logger.info("------------RXTInitInitInitInitInit--------");
//            iRet = RtxsvrapiObj.userIsExist(userName);
//        }
//        System.out.println("--------UnInitUnInitUnInitUnInitUnInit---------");
//        RtxsvrapiObj.UnInit();
//        return iRet == 0;
//    }
//
//    public static void getUserInfoByUserName(String userName){
//        String[][] info = null;
//
//        RTXSvrApi  rtxSvrApi = new RTXSvrApi();
//        if( rtxSvrApi.Init())
//        {
//            info =rtxSvrApi.GetUserSimpleInfo(userName);
//            if (info!=null)
//            {
//                for (int i = 0 ; i < info.length; i ++)
//                {
//                    for (int j = 0 ; j < 2 ; j++)
//                    {
//
//                        System.out.print(info[i][j]);
//                        System.out.print("\t");
//                    }
//
//                    System.out.println();
//                }
//            }
//            else
//            {
//                System.out.println("获取简单资料失败");
//            }
//
//        }
//        rtxSvrApi.UnInit();
//    }
//
//    //获取用户serssionKey
//    public static String getSessionKey(String userName){
//        String szKey= "";
//
//        RTXSvrApi  rtxSvrApi = new RTXSvrApi();
//        if( rtxSvrApi.Init())
//        {
//            szKey = rtxSvrApi.getSessionKey(userName);
//            System.out.println("SessionKey:" + szKey);
//
//        }
//        rtxSvrApi.UnInit();
//        return szKey;
//    }
//
//    //测试200个部门，2000个用户
////    public static void test(){
////        for (int i=1; i<=200; i++){
////            String deptId = ""+i;
////            addDept(new RTXDeptEntity(deptId,"测试部门_"+i, "0"));
////            for (int j=0; j<10; j++){
////                addUser(new RTXUserEntity("testUser_"+(i*10+j), deptId, "测试用户_"+(i*10+j), "123456"));
////            }
////        }
////        System.out.println("测试结束...");
////    }
//
//    public static void exportUserData(){
//        String  strRet= "";
//        RTXSvrApi  RtxsvrapiObj = new RTXSvrApi();
//        if( RtxsvrapiObj.Init())
//        {
//            strRet = RtxsvrapiObj.exportXmldata();
//            if (strRet!= null)
//            {
//                System.out.println(strRet);
//            }
//        }
//        RtxsvrapiObj.UnInit();
//    }
//
//    public static void main(String[] args) {
//        //addDept(new RTXDeptEntity("tset_568667", "呵呵部门", "0"));
//        //addUser(new RTXUserEntity("testUser_h12", "99", "哈哈", "123456"));
//        //editUser(new RTXUserEntity("testUser_h1", "99", "测试部门_199", "0"));
//        //getUserInfoByUserName("testUser_9");
//        //getSessionKey("liubao");
//        //test();
//        //exportUserData();
//    System.out.println(isExistUser("042699"));	;
////        for (int i=65;i<201;i++){
////            deleltDept(i+"", "1");
////        }
//    }
}
