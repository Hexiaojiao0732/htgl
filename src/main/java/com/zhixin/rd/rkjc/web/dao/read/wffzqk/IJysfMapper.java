package com.zhixin.rd.rkjc.web.dao.read.wffzqk;

import com.zhixin.rd.rkjc.web.entity.QkryajEntity;
import com.zhixin.rd.rkjc.web.entity.qk.SftXmsfry;

import java.util.List;
import java.util.Map;

/**
 * Created by 19703 on 2017/8/14.
 */
public interface IJysfMapper {
    List<QkryajEntity> queryRkjcxxByJysf(Map<String, Object> map);

    List<SftXmsfry> querySftXmsfry(Map<String, Object> map);
}
