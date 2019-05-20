package service.serivcelmpe;

import dao.ProfessionalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Professional;
import pojo.ProfessionalExample;
import service.ProfessionalService;

import java.util.List;

@Service
public class ProfessionalServiceImpe implements ProfessionalService {

    @Autowired
    private ProfessionalMapper professionalMapper;

    @Override
    public long countByExample(ProfessionalExample example) {
        return professionalMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ProfessionalExample example) {
        return professionalMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return professionalMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Professional record) {
        return professionalMapper.insert(record);
    }

    @Override
    public int insertSelective(Professional record) {
        return professionalMapper.insertSelective(record);
    }

    @Override
    public List<Professional> selectByExample(ProfessionalExample example) {
        return professionalMapper.selectByExample(example);
    }

    @Override
    public Professional selectByPrimaryKey(Integer id) {
        return professionalMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Professional record, ProfessionalExample example) {
        return professionalMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Professional record, ProfessionalExample example) {
        return professionalMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Professional record) {
        return professionalMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Professional record) {
        return professionalMapper.updateByPrimaryKey(record);
    }
}
