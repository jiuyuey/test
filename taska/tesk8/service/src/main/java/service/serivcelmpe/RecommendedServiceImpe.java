package service.serivcelmpe;

import dao.RecommendedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Recommended;
import pojo.RecommendedExample;
import service.RecommendedService;

import java.util.List;

@Service
public class RecommendedServiceImpe implements RecommendedService {

    @Autowired
    private RecommendedMapper recommendedMapper;

    @Override
    public long countByExample(RecommendedExample example) {
        return recommendedMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(RecommendedExample example) {
        return recommendedMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recommendedMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Recommended record) {
        return recommendedMapper.insert(record);
    }

    @Override
    public int insertSelective(Recommended record) {
        return recommendedMapper.insertSelective(record);
    }

    @Override
    public List<Recommended> selectByExample(RecommendedExample example) {
        return recommendedMapper.selectByExample(example);
    }

    @Override
    public Recommended selectByPrimaryKey(Integer id) {
        return recommendedMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Recommended record, RecommendedExample example) {
        return recommendedMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Recommended record, RecommendedExample example) {
        return recommendedMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Recommended record) {
        return recommendedMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Recommended record) {
        return recommendedMapper.updateByPrimaryKey(record);
    }
}
