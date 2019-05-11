package service.Impe;

import dao.ManagementcMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Managementc;
import pojo.ManagementcExample;
import service.ManagementcService;

import java.util.List;

@Service
public class ManagementcServiceImpe implements ManagementcService {

    @Autowired
    private ManagementcMapper managementcMapper;

    @Override
    public long countByExample(ManagementcExample example) {
        return managementcMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ManagementcExample example) {
        return managementcMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return managementcMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Managementc record) {
        return managementcMapper.insert(record);
    }

    @Override
    public int insertSelective(Managementc record) {
        return managementcMapper.insertSelective(record);
    }

    @Override
    public List<Managementc> selectByExample(ManagementcExample example) {
        return managementcMapper.selectByExample(example);
    }

    @Override
    public Managementc selectByPrimaryKey(Integer id) {
        return managementcMapper.selectByPrimaryKey(id);
    }

}
