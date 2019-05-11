package service.Impe;

import dao.BannerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Banner;
import pojo.BannerExample;
import service.BannerService;

import java.util.List;


@Service
public class BannerServiceImpe implements BannerService {

    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public long countByExample(BannerExample example) {
        return bannerMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BannerExample example) {
        return bannerMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return bannerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Banner record) {
        return bannerMapper.insert(record);
    }

    @Override
    public int insertSelective(Banner record) {
        return bannerMapper.insertSelective(record);
    }

    @Override
    public List<Banner> selectByExample(BannerExample example) {
        return bannerMapper.selectByExample(example);
    }

    @Override
    public Banner selectByPrimaryKey(Integer id) {
        return bannerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Banner record, BannerExample example) {
        return bannerMapper.updateByExampleSelective(record);
    }

    @Override
    public int updateByExample(Banner record, BannerExample example) {
        return bannerMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Banner record) {
        return bannerMapper.updateByExampleSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Banner record) {
        return bannerMapper.updateByPrimaryKey(record);
    }
}
