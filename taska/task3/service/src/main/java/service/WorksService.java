package service;

import org.springframework.stereotype.Service;
import pojo.Works;
import pojo.WorksExample;

import java.util.List;

@Service
public interface WorksService {
    long countByExample(WorksExample example);

    int deleteByExample(WorksExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Works record);

    int insertSelective(Works record);

    List<Works> selectByExample(WorksExample example);

    Works selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Works record);

    int updateByPrimaryKey(Works record);
}