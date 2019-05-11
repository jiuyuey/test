package dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import pojo.Studio;
import pojo.StudioExample;

import java.util.List;
@Repository
public interface StudioMapper {
    long countByExample(StudioExample example);

    int deleteByExample(StudioExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Studio record);

    int insertSelective(Studio record);

    List<Studio> selectByExample(StudioExample example);

    Studio selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Studio record, @Param("example") StudioExample example);

    int updateByExample(@Param("record") Studio record, @Param("example") StudioExample example);

    int updateByPrimaryKeySelective(Studio record);

    int updateByPrimaryKey(Studio record);
}