package com.zhixin.rd.memory.web.service.spnew;

import com.zhixin.rd.memory.web.dao.spnew.ISpNewMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SpNewServiceImpl implements ISpNewService {

    @Resource
    ISpNewMapper spNewMapper;

    @Override
    public List<Map<String, Object>> queryAllSp() {
        return spNewMapper.queryAllSp();
    }

    @Override
    public Map<String, Object> queryAllSpById(Integer id) {
        return spNewMapper.queryAllSpById(id);
    }
}
