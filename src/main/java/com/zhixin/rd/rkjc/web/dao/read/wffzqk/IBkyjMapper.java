package com.zhixin.rd.rkjc.web.dao.read.wffzqk;

import com.zhixin.rd.rkjc.web.entity.BkyjEntity;
import com.zhixin.rd.rkjc.web.form.BkyjForm;

import java.util.List;
import java.util.Map;

/**
 * Created by 19703 on 2017/7/17.
 */
public interface IBkyjMapper {
    List<BkyjEntity> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    void add(BkyjForm map);

    void update(BkyjForm form);
}
