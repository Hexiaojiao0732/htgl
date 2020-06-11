package com.zhixin.rd.rkjc.web.common;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhixin.rd.rkjc.web.entity.AreaEntity;
import com.zhixin.rd.rkjc.web.entity.OrganizationEntity;
import com.zhixin.rd.rkjc.web.entity.RoleEntity;
import com.zhixin.rd.rkjc.web.entity.UserEntity;

public class ControllerTool {

    private static final Logger logger = LoggerFactory.getLogger(ControllerTool.class);

    @Autowired
    private static PowerCacheUtil powerCacheUtil = null;

    public static SessionInfo getSessionInfo(HttpServletRequest request) {
        SessionInfo info = (SessionInfo) request.getSession().getAttribute("sessionInfo");
        if (info == null) {
            logger.info("Can not getSessionInfo from session!!!");
            info = new SessionInfo();
        }
        return info;
    }

    public static UserEntity getUser(HttpServletRequest request) {
        SessionInfo sessionInfo = ControllerTool.getSessionInfo(request);
        return sessionInfo.getUser();
    }

    public static Integer getUserID(HttpServletRequest request) {
        SessionInfo sessionInfo = ControllerTool.getSessionInfo(request);
        return sessionInfo.getUser().getId();
    }

    public static String getRoleName(HttpServletRequest request) {
        SessionInfo sessionInfo = ControllerTool.getSessionInfo(request);
        RoleEntity role = sessionInfo.getRole();
        return role.getName();
    }

    public static String getClienIp(HttpServletRequest request) {
        SessionInfo sessionInfo = ControllerTool.getSessionInfo(request);
        return sessionInfo.getClientIP();
    }

    /**
     * 通过HttpServletRequest返回IP地址
     *
     * @param request HttpServletRequest
     * @return ip String
     * @throws Exception
     */
    public static String getClientIpAddr(HttpServletRequest request) throws Exception {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    public static int getRoleDataAuth(HttpServletRequest request) {
        SessionInfo sessionInfo = ControllerTool.getSessionInfo(request);
        RoleEntity role = sessionInfo.getRole();
        return role.getDataAuth();
    }

    public static AreaEntity getCurrentArea(HttpServletRequest request) {
        SessionInfo sessionInfo = ControllerTool.getSessionInfo(request);
        return sessionInfo.getCurrentArea();
    }

    public static Integer getCurrentAreaID(HttpServletRequest request) {
        SessionInfo sessionInfo = ControllerTool.getSessionInfo(request);
        if (sessionInfo.getCurrentArea() != null && sessionInfo.getCurrentArea().getId() != null) {
            return sessionInfo.getCurrentArea().getId();
        }
        return null;
    }

    public static String getAreasInSql(String column, List<AreaEntity> areas) {
        if (areas == null || areas.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" ( ").append(column).append(" in(");
        int size = areas.size();
        for (int i = 0; i < size; i++) {
            sb.append(areas.get(i).getId());
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append(")) ");
        return sb.toString();
    }

    public static String getOrgsInSql(String column, List<OrganizationEntity> orgs) {
        if (orgs == null || orgs.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" ( ").append(column).append(" in(");
        int size = orgs.size();
        for (int i = 0; i < size; i++) {
            sb.append(orgs.get(i).getId());
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append(")) ");
        return sb.toString();
    }

    public static void main(String[] strs) {
        List<AreaEntity> areas = new ArrayList<AreaEntity>();
        AreaEntity a = new AreaEntity();
        a.setId(1);
        areas.add(a);
        areas.add(a);
        areas.add(a);
        System.out.println(getAreasInSql("seri_id", areas));

        System.out.println("==null==" + getAreasInSql("seri_id", new ArrayList<AreaEntity>()));
    }

    public static Map<String, Object> mapFilter(Map<String, Object> pageMap) {
        Map<String, Object> map = new HashMap<String, Object>();
        for (String key : pageMap.keySet()) {
            Object obj = pageMap.get(key);
            if (obj == null) {
                continue;
            }
            try {
                String value = obj.toString();
                if ("page".equalsIgnoreCase(key) || "rows".equalsIgnoreCase(key) || "xpage".equalsIgnoreCase(key)
                        || "xrows".equalsIgnoreCase(key)) {
                    map.put(key, new Integer(obj.toString()));
                    if ("page".equals(key)) {
                        map.put("pageStart", (Integer.parseInt(pageMap.get("page").toString()) - 1)
                                * Integer.parseInt(pageMap.get("rows").toString()));
                    }
                    if ("xpage".equals(key)) {
                        map.put("pageStart", (Integer.parseInt(pageMap.get("xpage").toString()) - 1)
                                * Integer.parseInt(pageMap.get("xrows").toString()));
                    }
                } else {
                    if (key.endsWith("_t")) {
                        // _t代表text 用String
                        if (value.length() > 0) {
                            map.put(cutKey(key, "_t"), value);
                        }
                    } else if (key.endsWith("_i")) {
                        // _i代表int
                        map.put(cutKey(key, "_i"), new Integer(value));
                    } else if (key.endsWith("_l")) {
                        // _i代表long
                        map.put(cutKey(key, "_l"), new Long(value));
                    } else if (key.endsWith("_d")) {
                        // _i代表date
                        SimpleDateFormat sdf = null;
                        if (value.length() < 4) {
                            continue;
                        } else if (value.length() == 4) {
                            sdf = new SimpleDateFormat("yyyy");
                        } else if (value.length() == 7) {
                            sdf = new SimpleDateFormat("yyyy-MM");
                        } else if (value.length() == 10) {
                            sdf = new SimpleDateFormat("yyyy-MM-dd");
                        } else {
                            sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        }
                        Date date = sdf.parse(value);
                        map.put(cutKey(key, "_d"), date);
                    } else {
                        if (value.trim().length() > 0) {
                            map.put(key, value);
                        }
                    }

                }
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
        return map;
    }

    private static String cutKey(String key, String word) {
        int i = key.lastIndexOf(word);
        if (i < 0) {
            return key;
        } else {
            return key.substring(0, i);
        }
    }

    // 根据部门集合获取用户Id集合
    public static List<Long> queryUsersByOrgs(List<Integer> orgs) {
        List<Long> userIds = new ArrayList<>();
        if (orgs != null) {
            for (Integer org : orgs) {
               // userIds.addAll(powerCacheUtil.getUsersByOrg(org));
            }
        }
        return userIds;
    }

    // 根据部门集合获取用户id的in语句(形如：in (1,2,3))
    public static String queryUsersInSqlByOrgs(List<Integer> orgs) {
        List<Long> users = queryUsersByOrgs(orgs);
        if (users != null) {
            StringBuffer sb = new StringBuffer();
            sb.append(" in (");
            for (int i = 0; i < users.size(); i++) {
                sb.append(users.get(i));
                if (i < (users.size() - 1)) {
                    sb.append(",");
                }
            }
            sb.append(")");
            return sb.toString();
        }
        return null;
    }

    // 根据部门集合获取用户Id集合
    public static List<Long> queryUsersByOrganizations(List<OrganizationEntity> orgs) {
        List<Long> userIds = new ArrayList<>();
        if (orgs != null) {
            for (OrganizationEntity org : orgs) {
               // userIds.addAll(powerCacheUtil.getUsersByOrg(org.getId()));
            }
        }
        return userIds;
    }

    // 根据部门集合获取用户id的in语句(形如：in (1,2,3))
    public static String queryUsersInSqlByOrganizations(List<OrganizationEntity> orgs) {
        List<Long> users = queryUsersByOrganizations(orgs);
        if (users != null) {
            StringBuffer sb = new StringBuffer();
            sb.append(" in (");
            for (int i = 0; i < users.size(); i++) {
                sb.append(users.get(i));
                if (i < (users.size() - 1)) {
                    sb.append(",");
                }
            }
            sb.append(")");
            return sb.toString();
        }
        return null;
    }

}
