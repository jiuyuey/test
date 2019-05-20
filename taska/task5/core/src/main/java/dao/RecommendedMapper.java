package dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import pojo.Recommended;
import pojo.RecommendedExample;

import java.util.List;
@Repository
public interface RecommendedMapper {
    long countByExample(RecommendedExample example);

    int deleteByExample(RecommendedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Recommended record);

    int insertSelective(Recommended record);

    List<Recommended> selectByExample(RecommendedExample example);

    Recommended selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Recommended record, @Param("example") RecommendedExample example);

    int updateByExample(@Param("record") Recommended record, @Param("example") RecommendedExample example);

    int updateByPrimaryKeySelective(Recommended record);

    int updateByPrimaryKey(Recommended record);
}