package com.zhixin.rd.rkjc.web.dao.read.qk;

import com.zhixin.rd.rkjc.entity.mysql.RkJbxxQkMysqlEntity;
import com.zhixin.rd.rkjc.web.entity.RkjcxxEntity;
import com.zhixin.rd.rkjc.web.form.YtsrForm;
import com.zhixin.rd.rkjc.web.entity.QkryajEntity;
import java.util.List;

/**
 * Created by wangly on 2017/7/26.
 */
public interface IYtsrQkMysqlMapper {
    Long listCount(YtsrForm form);
    List<QkryajEntity> listAllRkJbxxQk(YtsrForm form) throws Exception;
    RkjcxxEntity queryRkjcxxByYtsr( QkryajEntity qkryajEntityParam );
}
