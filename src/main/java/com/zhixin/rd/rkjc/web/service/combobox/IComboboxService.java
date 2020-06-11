package com.zhixin.rd.rkjc.web.service.combobox;

import com.zhixin.rd.rkjc.web.entity.ComboboxEntity;

import java.util.List;
import java.util.Map;

public interface IComboboxService {

	List<ComboboxEntity> listCertificateType(Map<String, Object> map) throws Exception;
	
	List<ComboboxEntity> getAllCuff(Map<String, Object> map) throws Exception;
	/**
	 * 根据类型获取对象类型下面的办案区的名字
	 * @param map
	 * @return
	 * @throws Exception
	 */
	List<ComboboxEntity> getAllInterrogateAreaName(Map<String, Object> map) throws Exception;
	List<ComboboxEntity> getAllCase(Map<String, Object> params);
	List<ComboboxEntity> getCaseByTime(Map<String, Object> map);

	List<ComboboxEntity> getAllPerson(Map<String, Object> params);

	List<ComboboxEntity> getAllUser(Map<String, Object> params);

	List<ComboboxEntity> getAllinterrogateSerial(Map<String, Object> params);

	List<ComboboxEntity> listAllOrganizationName(Map<String, Object> params);

	List<ComboboxEntity> listAllRoomGroupName(Map<String, Object> params);

	List<ComboboxEntity> listAllRoomName(Map<String, Object> params);
	
	List<ComboboxEntity> getAllOrder(Map<String, Object> params);

	List<ComboboxEntity> listRoomBySerial(Map<String, Object> params);

	List<ComboboxEntity> listunUsedbox(Map<String, Object> params);

	List<ComboboxEntity> listunUsedebox(Map<String, Object> params);
	
	List<ComboboxEntity> listFreeRecordRoom(Map<String, Object> params);
	
	List<ComboboxEntity> listLawType(Map<String, Object> params);
	
	List<ComboboxEntity> listLawName(Map<String, Object> params);
	
	List<ComboboxEntity> listBelongLockerBox(Integer areaId, Long lockerId);
	
	List<ComboboxEntity> listExhibitLockerBox(Integer areaId, Long lockerId);
	
	List<ComboboxEntity> listCrimeTypeByNature(Map<String, Object> params);

	List<ComboboxEntity> getAllInvLocation(Map<String, Object> params);

	List<ComboboxEntity> getAllShelf(Map<String, Object> params);
	
	List<ComboboxEntity> getDutyLeader(Map<String, Object> params);
}
