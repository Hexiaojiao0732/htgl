package com.zhixin.rd.rkjc.web.dao.read.qk;

import com.zhixin.rd.rkjc.entity.mysql.RkJbxxQkMysqlEntity;
import com.zhixin.rd.rkjc.web.form.ParamForm;

import java.util.List;

/**
 * Created by Jet on 2017/5/12.
 */
public interface IRkJbxxQkMysqlMapper {

    public List<RkJbxxQkMysqlEntity> listAllRkJbxxQk(ParamForm form) throws Exception;

    public  RkJbxxQkMysqlEntity  queryOneBySfzh(ParamForm form)throws Exception;

    Long listCount(ParamForm form);
}
