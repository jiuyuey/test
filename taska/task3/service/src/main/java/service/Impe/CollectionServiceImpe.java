package service.Impe;

import dao.CollectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Collection;
import pojo.CollectionExample;
import service.CollectionService;

import java.util.List;

@Service
public class CollectionServiceImpe implements CollectionService{

    @Autowired
    private CollectionMapper collectionMapper;

    @Override
    public long countByExample(CollectionExample example) {
        return collectionMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CollectionExample example) {
        return collectionMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return collectionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Collection record) {
        return collectionMapper.insert(record);
    }

    @Override
    public int insertSelective(Collection record) {
        return collectionMapper.insertSelective(record);
    }

    @Override
    public List<Collection> selectByExample(CollectionExample example) {
        return collectionMapper.selectByExample(example);
    }

    @Override
    public Collection selectByPrimaryKey(Integer id) {
        return collectionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Collection record) {
        return collectionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Collection record) {
        return collectionMapper.updateByPrimaryKey(record);
    }
}
