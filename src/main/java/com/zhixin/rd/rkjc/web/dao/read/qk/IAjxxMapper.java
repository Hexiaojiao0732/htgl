package com.zhixin.rd.rkjc.web.dao.read.qk;

import com.zhixin.rd.rkjc.web.entity.Ajxx;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by zyf on 2017/7/26.
 */
public interface IAjxxMapper {
    //以案搜人去案件中查询
    List<Ajxx> queryAjxxByYasr(Map<String,Object> ajbhMap);
}
