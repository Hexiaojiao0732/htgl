package com.zhixin.rd.rkjc.web.dao.read.wffzqk;

import com.zhixin.rd.rkjc.web.entity.QkryajEntity;
import com.zhixin.rd.rkjc.web.form.ParamForm;
import com.zhixin.rd.rkjc.web.entity.DmDzEntity;
import java.util.List;

/**
 * Created by zyf on 2017/7/26.
 */
public interface IPtcxMapper {

    List<QkryajEntity> queryQkyaj(ParamForm form);
    //
    DmDzEntity  quByDm(String qudm);
    DmDzEntity shiByDm(long shidm);
    DmDzEntity shengByDm(long shengdm);

}
