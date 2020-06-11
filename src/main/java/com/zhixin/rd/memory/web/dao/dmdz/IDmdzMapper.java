package com.zhixin.rd.memory.web.dao.dmdz;


import java.util.List;
import java.util.Map;

import com.zhixin.rd.memory.web.entity.DmDzEntity;


public interface IDmdzMapper {

    List<DmDzEntity> list(Map<String, Object> map);
    

  
}