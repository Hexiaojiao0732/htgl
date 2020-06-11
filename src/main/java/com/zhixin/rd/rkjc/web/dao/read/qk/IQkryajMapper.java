package com.zhixin.rd.rkjc.web.dao.read.qk;

import com.zhixin.rd.rkjc.web.entity.QkryajEntity;
import com.zhixin.rd.rkjc.web.form.YasrForm;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by zyf on 2017/7/26.
 */
public interface IQkryajMapper {
/*    //以案搜人中间表查询
    List<QkryajEntity> queryQkyaj(Map<String,Object> sfzhMap);*/

    List<QkryajEntity> queryQkyaj(YasrForm form);

    //复杂查询 查询总数
    long fzcxSearchCount(YasrForm form);

}
