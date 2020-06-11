package com.zhixin.rd.rkjc.web.dao.read.pq;

import com.zhixin.rd.rkjc.entity.mysql.RkJbxxPqMysqlEntity;
import com.zhixin.rd.rkjc.web.form.ParamForm;

import java.util.List;

/**
 * Created by Jet on 2017/5/12.
 */
public interface IRkJbxxPqMysqlMapper {

    public List<RkJbxxPqMysqlEntity> listAllRkJbxxPq(ParamForm form) throws Exception;

    public  RkJbxxPqMysqlEntity  queryOneBySfzh(ParamForm form)throws Exception;

    Long listCount(ParamForm form);
}
