package com.zhixin.rd.rkjc.web.dao.read.wffzqk;

import com.zhixin.rd.rkjc.entity.mysql.RkJbxxQkMysqlEntity;
import com.zhixin.rd.rkjc.web.entity.QkResultEntity;
import com.zhixin.rd.rkjc.web.form.ParamForm;

import java.util.List;

/**
 * Created by Jet on 2017/5/12.
 */
public interface IRkJbxxWffzqkMapper {

//    public  RkJbxxQkMysqlEntity  queryOneBySfzh(ParamForm form)throws Exception;

    Long listCount(ParamForm form);

    List<RkJbxxQkMysqlEntity> listAllRkJbxxWffzqk(ParamForm form);
}
