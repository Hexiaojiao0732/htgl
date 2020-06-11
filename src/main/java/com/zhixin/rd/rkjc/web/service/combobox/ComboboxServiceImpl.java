package com.zhixin.rd.rkjc.web.service.combobox;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zhixin.rd.rkjc.web.dao.read.combobox.IComboboxReadMapper;
import com.zhixin.rd.rkjc.web.entity.ComboboxEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ComboboxServiceImpl implements IComboboxService {
	@Autowired
	private IComboboxReadMapper comboboxMapper;

	@Override
	@Transactional
	public List<ComboboxEntity> listCertificateType(Map<String, Object> map) throws Exception {
		return comboboxMapper.listCertificateType(map);
	}

	@Override
	public List<ComboboxEntity> getAllCuff(Map<String, Object> map) throws Exception {
		return comboboxMapper.getAllCuff(map);
	}

	@Override
	public List<ComboboxEntity> getAllInterrogateAreaName(Map<String, Object> map) throws Exception {
		return comboboxMapper.getAllInterrogateAreaName(map);
	}

	@Override
	public List<ComboboxEntity> getAllCase(Map<String, Object> map) {
		return comboboxMapper.getAllCase(map);
	}

	@Override
	public List<ComboboxEntity> getAllPerson(Map<String, Object> map) {

		return comboboxMapper.getAllPerson(map);
	}

	@Override
	public List<ComboboxEntity> getAllUser(Map<String, Object> map) {

		return comboboxMapper.getAllUser(map);
	}

	@Override
	public List<ComboboxEntity> getAllinterrogateSerial(Map<String, Object> map) {

		return comboboxMapper.getAllinterrogateSerial(map);
	}

	@Override
	public List<ComboboxEntity> listAllRoomGroupName(Map<String, Object> map) {
		return comboboxMapper.listAllRoomGroupName(map);
	}

	@Override
	public List<ComboboxEntity> listAllOrganizationName(Map<String, Object> params) {
		return comboboxMapper.listAllOrganizationName(params);

	}

	@Override
	public List<ComboboxEntity> listAllRoomName(Map<String, Object> map) {
		return comboboxMapper.listAllRoomName(map);
	}

	@Override
	public List<ComboboxEntity> getAllOrder(Map<String, Object> params) {
		return comboboxMapper.getAllOrder(params);
	}

	@Override
	public List<ComboboxEntity> listRoomBySerial(Map<String, Object> params) {
		return comboboxMapper.listRoomBySerial(params);
	}

	@Override
	public List<ComboboxEntity> listunUsedbox(Map<String, Object> params) {

		return comboboxMapper.listunUsedbox(params);
	}

	@Override
	public List<ComboboxEntity> listunUsedebox(Map<String, Object> params) {

		return comboboxMapper.listunUsedebox(params);
	}

	@Override
	public List<ComboboxEntity> listFreeRecordRoom(Map<String, Object> params) {
		return comboboxMapper.listFreeRecordRoom(params);
	}

	@Override
	public List<ComboboxEntity> listLawType(Map<String, Object> params) {
		return comboboxMapper.listLawType(params);
	}

	@Override
	public List<ComboboxEntity> listLawName(Map<String, Object> params) {
		return comboboxMapper.listLawName(params);
	}

	@Override
	public List<ComboboxEntity> listBelongLockerBox(Integer areaId,Long lockerId){
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("areaId", areaId);
		params.put("lockerId", lockerId);
		return comboboxMapper.listBelongLockerBox(params);
	}
	
	@Override
	public List<ComboboxEntity> listExhibitLockerBox(Integer areaId,Long lockerId){
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("areaId", areaId);
		params.put("lockerId", lockerId);
		return comboboxMapper.listExhibitLockerBox(params);
	}
	
	@Override
	public List<ComboboxEntity> listCrimeTypeByNature(Map<String, Object> params) {
		return comboboxMapper.listCrimeTypeByNature(params);
	}


	@Override
	public List<ComboboxEntity> getAllInvLocation(Map<String, Object> params) {
		return comboboxMapper.getAllInvLocation(params);
	}

	@Override
	public List<ComboboxEntity> getAllShelf(Map<String, Object> params) {
		return comboboxMapper.getAllShelf(params);
	}


	@Override
	public List<ComboboxEntity> getCaseByTime(Map<String, Object> map) {
		return comboboxMapper.getCaseByTime(map);
	}

	@Override
	public List<ComboboxEntity> getDutyLeader(Map<String, Object> params) {
		return comboboxMapper.getDutyLeader(params);
	}

}
