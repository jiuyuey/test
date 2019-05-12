package dao;

import org.apache.ibatis.annotations.Param;
import pojo.Works;
import pojo.WorksExample;

import java.util.List;

public interface WorksMapper {
    long countByExample(WorksExample example);

    int deleteByExample(WorksExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Works record);

    int insertSelective(Works record);

    List<Works> selectByExample(WorksExample example);

    Works selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Works record, @Param("example") WorksExample example);

    int updateByExample(@Param("record") Works record, @Param("example") WorksExample example);

    int updateByPrimaryKeySelective(Works record, WorksExample example);

    int baUpdate(List<Works> list);

    int updateByPrimaryKeySelective(Works record);
}