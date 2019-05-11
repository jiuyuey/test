package service.Impe;

import dao.WorksMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Works;
import pojo.WorksExample;
import service.WorksService;

import java.util.List;

@Service
public class WorksServiceImpe implements WorksService {

    @Autowired
    private WorksMapper worksMapper;

    @Override
    public long countByExample(WorksExample example) {
        return worksMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(WorksExample example) {
        return worksMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return worksMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Works record) {
        return worksMapper.insert(record);
    }

    @Override
    public int insertSelective(Works record) {
        return worksMapper.insertSelective(record);
    }

    @Override
    public List<Works> selectByExample(WorksExample example) {
        return worksMapper.selectByExample(example);
    }

    @Override
    public Works selectByPrimaryKey(Integer id) {
        return worksMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Works record) {
        return worksMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Works record) {
        return worksMapper.updateByPrimaryKey(record);
    }
}
