package dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import pojo.Professional;
import pojo.ProfessionalExample;

import java.util.List;

@Repository
public interface ProfessionalMapper {
    long countByExample(ProfessionalExample example);

    int deleteByExample(ProfessionalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Professional record);

    int insertSelective(Professional record);

    List<Professional> selectByExample(ProfessionalExample example);

    Professional selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Professional record, @Param("example") ProfessionalExample example);

    int updateByExample(@Param("record") Professional record, @Param("example") ProfessionalExample example);

    int updateByPrimaryKeySelective(Professional record);

    int updateByPrimaryKey(Professional record);
}