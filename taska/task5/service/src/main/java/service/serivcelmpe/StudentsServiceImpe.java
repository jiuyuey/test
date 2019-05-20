package service.serivcelmpe;

import dao.StudentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Students;
import pojo.StudentsExample;
import service.StudentsService;

import java.util.List;

@Service
public class StudentsServiceImpe implements StudentsService {

    @Autowired
    private StudentsMapper studentsMapper;

    @Override
    public long countByExample(StudentsExample example) {
        return studentsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(StudentsExample example) {
        return studentsMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return studentsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Students record) {
        return studentsMapper.insert(record);
    }

    @Override
    public int insertSelective(Students record) {
        return studentsMapper.insertSelective(record);
    }

    @Override
    public List<Students> selectByExample(StudentsExample example) {
        return studentsMapper.selectByExample(example);
    }

    @Override
    public Students selectByPrimaryKey(Integer id) {
        return studentsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Students record, StudentsExample example) {
        return studentsMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Students record, StudentsExample example) {
        return studentsMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Students record) {
        return studentsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Students record) {
        return studentsMapper.updateByPrimaryKey(record);
    }
}
