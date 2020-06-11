package com.zhixin.rd.rkjc.web.controller.echarts;

import com.zhixin.rd.rkjc.web.entity.AccessLogEntity;
import com.zhixin.rd.rkjc.web.service.accesslog.IAccessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/rkjc/echarts")
public class InterfaceNumController {

    @Autowired
    private IAccessLogService accessLogService;

    @RequestMapping("/interfaceNum")
    @ResponseBody
    public Map<Integer,Map<String, Integer>>queryInterfaceNum(){
        List<AccessLogEntity> list =accessLogService.queryInterfaceNum();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("d");
        Map<Integer,Map<String, Integer>> allMap =new HashMap<>();
        for (AccessLogEntity accessLogEntity:list) {
            int date = Integer.parseInt(simpleDateFormat.format(accessLogEntity.getResponseTime()));
            //判断allMap里面是不是有这个key
            if (allMap.containsKey(date)) {
                Map<String, Integer> map = allMap.get(date);
                int peoNum = map.get("piNum");
                int bgNum = map.get("tiNum");
                if (accessLogEntity.getAccessInterfaceType().equals(1)){
                    peoNum++;
                }else {
                    bgNum++;
                }

                map.clear();
                map.put("piNum", peoNum);
                map.put("tiNum", bgNum);
                map.put("totalNum", peoNum+bgNum);
                allMap.put(date, map);
            } else {
                int peoNum = 0;
                int bgNum = 0;
                if (accessLogEntity.getAccessInterfaceType().equals(1)){
                    peoNum++;
                }else {
                    bgNum++;
                }
                Map<String, Integer> map = new HashMap<>();
                map.put("piNum", peoNum);
                map.put("tiNum", bgNum);
                map.put("totalNum", peoNum+bgNum);
                allMap.put(date, map);
            }
        }
        //若没有数据的日期自动补充
        for(int i=0; i<(Calendar.getInstance().get(Calendar.DAY_OF_MONTH)); i++){
            Integer tempKey = i+1;
            if (!allMap.containsKey(tempKey)){
                Map<String, Integer> map = new HashMap<>();
                map.put("piNum", 0);
                map.put("tiNum", 0);
                map.put("totalNum", 0);
                allMap.put(tempKey, map);
            }
        }
        //对Map集合按照日期排序
        sortMap(allMap);
        return allMap;
    }

    private static void sortMap(Map<Integer,Map<String, Integer>> map){
        List<Map.Entry<Integer,Map<String, Integer>>> infoIds = new ArrayList<Map.Entry<Integer,Map<String, Integer>>>(map.entrySet());
        //排序
        Collections.sort(infoIds, new Comparator<Map.Entry<Integer,Map<String, Integer>>>() {
            public int compare(Map.Entry<Integer,Map<String, Integer>> o1, Map.Entry<Integer,Map<String, Integer>> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
    }
}
