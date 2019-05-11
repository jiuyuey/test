package service.Impe;

import dao.AdministratorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Administrator;
import pojo.AdministratorExample;
import service.AdministratorService;

import java.util.List;

@Service
public class AdministratorServiceImpe implements AdministratorService {

    @Autowired
    private AdministratorMapper administratorMapper;

    @Override
    public long countByExample(AdministratorExample example) {
        return administratorMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AdministratorExample example) {
        return administratorMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return administratorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Administrator record) {
        return administratorMapper.insert(record);
    }

    @Override
    public int insertSelective(Administrator record) {
        return administratorMapper.insertSelective(record);
    }

    @Override
    public List<Administrator> selectByExample(AdministratorExample example) {
        return administratorMapper.selectByExample(example);
    }

    @Override
    public Administrator selectByPrimaryKey(Integer id) {
        return administratorMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Administrator record) {
        return administratorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Administrator record) {
        return administratorMapper.updateByPrimaryKey(record);
    }
}