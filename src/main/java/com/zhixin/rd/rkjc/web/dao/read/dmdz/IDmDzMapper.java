package com.zhixin.rd.rkjc.web.dao.read.dmdz;

import com.zhixin.rd.rkjc.web.entity.DmDzEntity;

import java.util.List;
import java.util.Map;


public interface IDmDzMapper {

    List<DmDzEntity> list(Map<String, Object> map);
    

  
}