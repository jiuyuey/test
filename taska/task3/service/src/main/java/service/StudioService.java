package service;

import org.springframework.stereotype.Service;
import pojo.Studio;
import pojo.StudioExample;

import java.util.List;

@Service
public interface StudioService {
    long countByExample(StudioExample example);

    int deleteByExample(StudioExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Studio record);

    int insertSelective(Studio record);

    List<Studio> selectByExample(StudioExample example);

    Studio selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Studio record);

    int updateByPrimaryKey(Studio record);

}