package service;

import org.springframework.stereotype.Service;
import pojo.Level;
import pojo.LevelExample;

import java.util.List;

@Service
public interface LevelService {
    long countByExample(LevelExample example);

    int deleteByExample(LevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Level record);

    int insertSelective(Level record);

    List<Level> selectByExample(LevelExample example);

    Level selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Level record);

    int updateByPrimaryKey(Level record);

}