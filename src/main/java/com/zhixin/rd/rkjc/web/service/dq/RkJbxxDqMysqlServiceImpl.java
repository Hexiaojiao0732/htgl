/*
 * FileName: PqaWfryMysqlService.java
 * auto create by wangguhua
 * Author:   
 * Description: PqaWfryMysqlService实体类   
 */

package com.zhixin.rd.rkjc.web.service.dq;

import com.zhixin.rd.rkjc.entity.mysql.RkJbxxDqMysqlEntity;
import com.zhixin.rd.rkjc.web.common.PropertyUtil;
import com.zhixin.rd.rkjc.web.dao.read.dq.IRkJbxxDqMysqlMapper;
import com.zhixin.rd.rkjc.web.entity.DqResultEntity;
import com.zhixin.rd.rkjc.web.entity.RkCXEntity;
import com.zhixin.rd.rkjc.web.form.ParamForm;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 实体类PqaWfryMysqlService table: pqa_wfry
 *
 * @author wangguhua
 */
@Service
public class RkJbxxDqMysqlServiceImpl implements IRkJbxxDqMysqlService {

    private static Logger logger = Logger.getLogger(RkJbxxDqMysqlServiceImpl.class);

    @Autowired
    private IRkJbxxDqMysqlMapper rkJbxxDqMysqlMapper;


    @Override
    public List<DqResultEntity> listAllRkJbxxPq(ParamForm form) throws Exception {

        if (form.getCsrq() != null && !form.getCsrq().equals("")) {
            String[] csrqParm = form.getCsrq().split("-");
            form.setCsrqStart(csrqParm[0]);
            form.setCsrqEnd(csrqParm[1]);
        }

        if(form.getLyd()!=null&&!form.getLyd().equals("")){

            String [] lydArray=form.getLyd().split(",");
            StringBuffer stringBuffer=new StringBuffer();
            for (int i=0;i<lydArray.length;i++){
                stringBuffer.append("'");
                stringBuffer.append(lydArray[i]);
                stringBuffer.append("'");
                if(i!=lydArray.length-1){
                    stringBuffer.append(",");
                }

            }
            form.setLyd(stringBuffer.toString());
        }

        if(form.getPageIndex()!=0){
            form.setPageIndex((form.getPageIndex()-1)*8);
        }

        List<RkJbxxDqMysqlEntity> entityList = rkJbxxDqMysqlMapper.listAllRkJbxxDq(form);

        List<DqResultEntity> dqResultEntities = new ArrayList<>();
        for (RkJbxxDqMysqlEntity entity : entityList) {
            DqResultEntity dqResultEntity = new DqResultEntity();
            dqResultEntity.setGmsfhm(entity.getGmsfhm());
            dqResultEntity.setXm(entity.getXm());
            String xb = entity.getXbDm();
            if (xb.equals("1")) {
                xb = "男";
            } else if (xb.equals("2")) {
                xb = "女";
            } else {
                xb = "未知";
            }
            dqResultEntity.setXb(xb);
            dqResultEntity.setCsrq(entity.getCsrq() == null ? "" : entity.getCsrq().toString());
            dqResultEntity.setHjd(entity.getCsdxz());
            dqResultEntity.setXzz(entity.getZz());
            dqResultEntity.setAjbh(entity.getLybzjzd());
            dqResultEntity.setZpUrl(PropertyUtil.getContextProperty("pqZp.url") + "?sfzh=" + entity.getGmsfhm());
            dqResultEntities.add(dqResultEntity);
        }


        return dqResultEntities;
    }

    @Override
    public DqResultEntity queryOneBySfzh(ParamForm form) throws Exception {
        RkJbxxDqMysqlEntity entity = rkJbxxDqMysqlMapper.queryOneBySfzh(form);
        DqResultEntity dqResultEntity = new DqResultEntity();
        if (entity != null) {
            dqResultEntity.setGmsfhm(entity.getGmsfhm());
            dqResultEntity.setXm(entity.getXm());
            String xb = entity.getXbDm();
            if (xb.equals("1")) {
                xb = "男";
            } else if (xb.equals("2")) {
                xb = "女";
            } else {
                xb = "未知";
            }
            dqResultEntity.setXb(xb);
            dqResultEntity.setCsrq(entity.getCsrq() == null ? "" : entity.getCsrq().toString());
            dqResultEntity.setHjd(entity.getCsdxz());
            dqResultEntity.setXzz(entity.getZz());
            dqResultEntity.setZpUrl(PropertyUtil.getContextProperty("pqZp.url") + "?sfzh=" + entity.getGmsfhm());
        }
        return dqResultEntity;
    }

    @Override
    public Long listCount(ParamForm form) {

        if (form.getCsrq() != null && !form.getCsrq().equals("")) {
            String[] csrqParm = form.getCsrq().split("-");
            form.setCsrqStart(csrqParm[0]);
            form.setCsrqEnd(csrqParm[1]);
        }

        if(form.getLyd()!=null&&!form.getLyd().equals("")){

            String [] lydArray=form.getLyd().split(",");
            StringBuffer stringBuffer=new StringBuffer();
            for (int i=0;i<lydArray.length;i++){
                stringBuffer.append("'");
                stringBuffer.append(lydArray[i]);
                stringBuffer.append("'");
                if(i!=lydArray.length-1){
                    stringBuffer.append(",");
                }
            }
            form.setLyd(stringBuffer.toString());
        }
        return rkJbxxDqMysqlMapper.listCount(form);
    }

	@Override
	public List<RkCXEntity> getSjly() throws Exception {
		// TODO Auto-generated method stub
		List<RkCXEntity> list = rkJbxxDqMysqlMapper.getSjly();
		
		return list;
	}

	@Override
	public Map<String, Object> getSqrk() throws Exception {
		// TODO Auto-generated method stub
		List<RkCXEntity> list = rkJbxxDqMysqlMapper.getSqrk();
		Map<String,Object> map = new HashMap<>();
		for(RkCXEntity rkcx: list){
			map.put(rkcx.getSq(), rkcx.getRkCount());
		}
		return map;
	}

	@Override
	public List<RkCXEntity> getDq() throws Exception {
		// TODO Auto-generated method stub
		return rkJbxxDqMysqlMapper.getDq();
	}
	
}