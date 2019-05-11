package service.Impe;

import dao.LevelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Level;
import pojo.LevelExample;
import service.LevelService;

import java.util.List;

@Service
public class LevelServiceImpe implements LevelService {

    @Autowired
    private LevelMapper levelMapper;

    @Override
    public long countByExample(LevelExample example) {
        return levelMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(LevelExample example) {
        return levelMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return levelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Level record) {
        return levelMapper.insert(record);
    }

    @Override
    public int insertSelective(Level record) {
        return levelMapper.insertSelective(record);
    }

    @Override
    public List<Level> selectByExample(LevelExample example) {
        return levelMapper.selectByExample(example);
    }

    @Override
    public Level selectByPrimaryKey(Integer id) {
        return levelMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Level record) {
        return levelMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Level record) {
        return levelMapper.updateByPrimaryKey(record);
    }
}
