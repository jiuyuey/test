package dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import pojo.Managementc;
import pojo.ManagementcExample;

import java.util.List;
@Repository
public interface ManagementcMapper {
    long countByExample(ManagementcExample example);

    int deleteByExample(ManagementcExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Managementc record);

    int insertSelective(Managementc record);

    List<Managementc> selectByExample(ManagementcExample example);

    Managementc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Managementc record, @Param("example") ManagementcExample example);

    int updateByExample(@Param("record") Managementc record, @Param("example") ManagementcExample example);

    int updateByPrimaryKeySelective(Managementc record);

    int updateByPrimaryKey(Managementc record);
}