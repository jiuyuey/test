package service.Impe;

import dao.ModuleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Module;
import pojo.ModuleExample;
import service.ModuleService;

import java.util.List;

@Service
public class ModuleServiceImpe implements ModuleService {

    @Autowired
    private ModuleMapper moduleMapper;

    @Override
    public long countByExample(ModuleExample example) {
        return moduleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ModuleExample example) {
        return moduleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return moduleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Module record) {
        return moduleMapper.insert(record);
    }

    @Override
    public int insertSelective(Module record) {
        return moduleMapper.insertSelective(record);
    }

    @Override
    public List<Module> selectByExample(ModuleExample example) {
        return moduleMapper.selectByExample(example);
    }

    @Override
    public Module selectByPrimaryKey(Integer id) {
        return moduleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Module record) {
        return moduleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Module record) {
        return moduleMapper.updateByPrimaryKey(record);
    }
}