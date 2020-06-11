package com.zhixin.rd.rkjc.web.service.dq;

import com.zhixin.rd.rkjc.entity.mysql.AjJbxxMysqlEntity;
import com.zhixin.rd.rkjc.entity.mysql.AjXyrxxMysqlEntity;
import com.zhixin.rd.rkjc.web.dao.read.dq.IAjJbxxDqMysqlMapper;
import com.zhixin.rd.rkjc.web.dao.read.dq.IAjXyrxxDqMysqlMapper;
import com.zhixin.rd.rkjc.web.entity.DqResultEntity;
import com.zhixin.rd.rkjc.web.entity.PqResultEntity;
import com.zhixin.rd.rkjc.web.form.ParamForm;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NewJZptDqMysqlService implements INewJZptDqMysqlService{

	private static Logger logger = Logger.getLogger(NewJZptDqMysqlService.class);

	@Autowired
	private IAjJbxxDqMysqlMapper ajJbxxDqMysqlMapper = null;

	@Autowired
	private IAjXyrxxDqMysqlMapper ajXyrxxDqMysqlMapper = null;
	
	@Override
	public List<DqResultEntity> listAjXyrxxPq(ParamForm form) throws Exception {

		Map<String, String> map = new HashMap<>();
		if (form.getGmsfhm() != null&&!form.getGmsfhm().equals("")  ) {
			map.put("gmsfhm", form.getGmsfhm());
		}
		if (form.getXm() != null&&!form.getXm().equals("")) {
			map.put("xm", form.getXm());
		}

		if (form.getXb() != null&&!form.getXb().equals("")) {
			map.put("xb", form.getXb());
		}

		if (form.getHjd() != null&&!form.getHjd().equals("")) {

			map.put("hjd", form.getHjd());
		}
		if ( form.getCsrq() != null&& !form.getCsrq().equals("") )
		{
			String[] csrqParm = form.getCsrq().split("-");

			map.put("csrqStart", csrqParm[0]);
			map.put("csrqEnd",csrqParm[1]);

		}
		if (form.getSfzhAll() != null&&!form.getSfzhAll().equals("")) {

			map.put("sfzhAll", form.getSfzhAll());
		}
		List<AjXyrxxMysqlEntity> entityList=ajXyrxxDqMysqlMapper.listAjXyrxxDq(map);
		List<DqResultEntity> dqResultEntities=new ArrayList<>();
		for (AjXyrxxMysqlEntity entity : entityList){
			DqResultEntity dqResultEntity=new DqResultEntity();
			dqResultEntity.setRybh(entity.getXyrbh());
			dqResultEntity.setAjbh(entity.getAjbh());
			dqResultEntity.setGmsfhm(entity.getGmsfhm());
			dqResultEntity.setXm(entity.getXm());
			dqResultEntity.setXb(entity.getXb());
			dqResultEntity.setCsrq(entity.getCsrq());
			dqResultEntity.setHjd(entity.getHjdzxz());
			dqResultEntity.setXzz(entity.getZzxz());

			AjJbxxMysqlEntity ajJbxxMysqlEntity= getAjJbxxPqByAjbh(entity.getAjbh());
			if(ajJbxxMysqlEntity!=null){
				dqResultEntity.setZbdw(ajJbxxMysqlEntity.getZbdw());
				dqResultEntity.setJyaq(ajJbxxMysqlEntity.getAjmc());
				dqResultEntity.setDcsj(ajJbxxMysqlEntity.getSlsj());//打处时间
				dqResultEntity.setAfsj(ajJbxxMysqlEntity.getBasj());
			}

			dqResultEntity.setFromTable("aj_xyrxx_pq");
			dqResultEntity.setLyd("警综平台");
			dqResultEntity.setZpUrl("getPersonImgForJZ.do?sfzh=" + entity.getGmsfhm());
			dqResultEntities.add(dqResultEntity);
		}
		return dqResultEntities;
	}

	private AjJbxxMysqlEntity getAjJbxxPqByAjbh(String ajbh) throws Exception {
		Map<String, Object> map =new HashMap<String, Object>();
		map.put("ajbh", ajbh);
		return ajJbxxDqMysqlMapper.getAjJbxxDqByAjbh(map);
	}
	
}
