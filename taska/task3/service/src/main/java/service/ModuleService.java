package service;

import org.springframework.stereotype.Service;
import pojo.Module;
import pojo.ModuleExample;

import java.util.List;

@Service
public interface ModuleService {

    long countByExample(ModuleExample example);

    int deleteByExample(ModuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Module record);

    int insertSelective(Module record);

    List<Module> selectByExample(ModuleExample example);//全部查询，分页

    Module selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);
}
