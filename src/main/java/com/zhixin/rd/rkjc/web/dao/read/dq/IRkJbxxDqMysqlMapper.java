package com.zhixin.rd.rkjc.web.dao.read.dq;

import com.zhixin.rd.rkjc.entity.mysql.RkJbxxDqMysqlEntity;
import com.zhixin.rd.rkjc.entity.mysql.RkJbxxPqMysqlEntity;
import com.zhixin.rd.rkjc.web.entity.RkCXEntity;
import com.zhixin.rd.rkjc.web.form.ParamForm;

import java.util.List;
import java.util.Map;

/**
 * Created by Jet on 2017/5/12.
 */
public interface IRkJbxxDqMysqlMapper {

    public List<RkJbxxDqMysqlEntity> listAllRkJbxxDq(ParamForm form) throws Exception;

    public  RkJbxxDqMysqlEntity  queryOneBySfzh(ParamForm form)throws Exception;

    Long listCount(ParamForm form);
    
    public List<RkCXEntity> getSjly() throws Exception;
    
    public List<RkCXEntity> getSqrk() throws Exception;
    
    public List<RkCXEntity> getDq() throws Exception;
}
