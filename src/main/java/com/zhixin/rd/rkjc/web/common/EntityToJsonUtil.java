package com.zhixin.rd.rkjc.web.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.zhixin.rd.rkjc.web.entity.TagTypeEntity;

/**
 * Created by Jet on 2017/3/8.
 */
public class EntityToJsonUtil {
    /**
     * 实体转换成Json字符串，只包含权限中的字段
     *
     * @param obj 实体对象
     *
     *@param includeField 权限字段字符串  如：“filed1，field2”
     *
     * @return json字符串
     */
    public static String entityToJsonNoNullField(Object obj,String includeField){

        SimplePropertyPreFilter filter = new SimplePropertyPreFilter();
        String [] includeFieldArray=includeField.split(",");
        for(String field:includeFieldArray){
            filter.getIncludes().add(field);
        }
        String result=JSON.toJSONString(obj,filter, SerializerFeature.WriteMapNullValue);


        return  result;
    }

    public static void main(String[] args) {

        String str="11";
        JSONObject paramJsonObject=  JSON.parseObject(str);

        TagTypeEntity entity=new TagTypeEntity();
        entity.setTagName("111");
        SimplePropertyPreFilter filter = new SimplePropertyPreFilter();

        filter.getIncludes().add("tagName");
        filter.getIncludes().add("tagTableName");
        String j=JSON.toJSONString(entity,filter,SerializerFeature.WriteMapNullValue);

        System.out.println(j);

    }

}
