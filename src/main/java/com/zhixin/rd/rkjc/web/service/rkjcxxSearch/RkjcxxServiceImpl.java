package com.zhixin.rd.rkjc.web.service.rkjcxxSearch;

import com.zhixin.rd.rkjc.web.common.PropertyUtil;
import com.zhixin.rd.rkjc.web.dao.read.rkjcxxSearch.IGjMapper;
import com.zhixin.rd.rkjc.web.dao.read.rkjcxxSearch.IRkjcxxMapper;
import com.zhixin.rd.rkjc.web.entity.GjEntity;
import com.zhixin.rd.rkjc.web.entity.RkjcxxEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.*;

/**
 * Created by yangyk on 2017/07/19
 */
@Service
public class RkjcxxServiceImpl implements IRkjcxxService {
	@Autowired
    private IRkjcxxMapper rkjcxxMapper;

	@Override
	public RkjcxxEntity queryRkjcxxByZjhm(String zjhm) {
		List<RkjcxxEntity> rkjcxxEntityList= rkjcxxMapper.queryRkjcxxByZjhm(zjhm);
		RkjcxxEntity entity=new RkjcxxEntity();
		if(rkjcxxEntityList!=null && rkjcxxEntityList.size()>0){
			//找到信息比较全的 RkjcxxEntity
			if(rkjcxxEntityList.size()>1){
				for (int i = 0; i < rkjcxxEntityList.size(); i++) {
					if(rkjcxxEntityList.get(i).getRylbdm()!=null&&rkjcxxEntityList.get(i).getRylbdm().equals("999")){
						continue;
					}
					entity=rkjcxxEntityList.get(i);
				}
			}else {
				entity = rkjcxxEntityList.get(0);
			}
			//判断本地文件是否存在，不存在返回查询URL
			String zpPath= PropertyUtil.getContextProperty("rkjcxxImage.path")+entity.getZjhm()+".jpg";
			File file=new File(zpPath);
			if(file.exists()){
				entity.setZpURL(PropertyUtil.getContextProperty("rkjcxxExist.url") + "?path=" + zpPath);
			}else{
				entity.setZpURL(PropertyUtil.getContextProperty("rkjcxxNotExist.url") + "?sfzh=" + entity.getZjhm());

			}
		}


		return entity;
	}
}
