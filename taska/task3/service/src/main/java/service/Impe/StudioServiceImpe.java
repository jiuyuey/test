package service.Impe;

import dao.StudioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Studio;
import pojo.StudioExample;
import service.StudioService;

import java.util.List;

@Service
public class StudioServiceImpe implements StudioService {

    @Autowired
    private StudioMapper studioMapper;

    @Override
    public long countByExample(StudioExample example) {
        return studioMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(StudioExample example) {
        return studioMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return studioMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Studio record) {
        return studioMapper.insert(record);
    }

    @Override
    public int insertSelective(Studio record) {
        return studioMapper.insertSelective(record);
    }

    @Override
    public List<Studio> selectByExample(StudioExample example) {
        return studioMapper.selectByExample(example);
    }

    @Override
    public Studio selectByPrimaryKey(Integer id) {
        return studioMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Studio record) {
        return studioMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Studio record) {
        return studioMapper.updateByPrimaryKey(record);
    }
}
