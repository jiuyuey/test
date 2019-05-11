package service;

import org.springframework.stereotype.Service;
import pojo.Managementc;
import pojo.ManagementcExample;

import java.util.List;

@Service
public interface ManagementcService {
    long countByExample(ManagementcExample example);

    int deleteByExample(ManagementcExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Managementc record);

    int insertSelective(Managementc record);

    List<Managementc> selectByExample(ManagementcExample example);

    Managementc selectByPrimaryKey(Integer id);

}