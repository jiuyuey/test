package controller;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pojo.Recommended;
import pojo.RecommendedExample;
import service.RecommendedService;
import controller.util.Page;

import java.util.List;

@Controller
@RequestMapping("/company")
public class ThreePageController {

    @Autowired
    private RecommendedService recommendedService;

    @RequestMapping(value = "/a",method = RequestMethod.GET)//跳转推荐页面
    public ModelAndView a(){
        ModelAndView company = new ModelAndView();
        RecommendedExample example = new RecommendedExample();

        Page page = new Page();
        page.setPageSize(1);//定死只有1人
        page.setStart(0);
        long totat = recommendedService.countByExample(example);//计数
        PageHelper.offsetPage(page.getStart(),page.getPageSize());

        List<Recommended> list = recommendedService.selectByExample(example);
        page.callbang(totat);
        if (list != null && list.size()>0){
            company.addObject("code",list);
        }
        company.setViewName("companyy");
        return company;
    }

    @RequestMapping(value = "/b",method = RequestMethod.GET)//跳转推荐页面
    public ModelAndView b(){
        ModelAndView b = new ModelAndView();
        RecommendedExample example = new RecommendedExample();

        Page page = new Page();
        page.setPageSize(1);//定死只有1人
        page.setStart(1);
        long totat = recommendedService.countByExample(example);//计数
        PageHelper.offsetPage(page.getStart(),page.getPageSize());

        List<Recommended> list = recommendedService.selectByExample(example);
        page.callbang(totat);
        if (list != null && list.size()>0){
            b.addObject("code",list);
        }
        b.setViewName("companyy");
        return b;
    }

    @RequestMapping(value = "/c",method = RequestMethod.GET)//跳转推荐页面
    public ModelAndView c(){
        ModelAndView c = new ModelAndView();
        RecommendedExample example = new RecommendedExample();

        Page page = new Page();
        page.setPageSize(1);//定死只有1人
        page.setStart(2);
        long totat = recommendedService.countByExample(example);//计数
        PageHelper.offsetPage(page.getStart(),page.getPageSize());

        List<Recommended> list = recommendedService.selectByExample(example);
        page.callbang(totat);
        if (list != null && list.size()>0){
            c.addObject("code",list);
        }
        c.setViewName("companyy");
        return c;
    }

    @RequestMapping(value = "/d",method = RequestMethod.GET)//跳转推荐页面
    public ModelAndView d(){
        ModelAndView d = new ModelAndView();
        RecommendedExample example = new RecommendedExample();

        Page page = new Page();
        page.setPageSize(1);//定死只有1人
        page.setStart(3);
        long totat = recommendedService.countByExample(example);//计数
        PageHelper.offsetPage(page.getStart(),page.getPageSize());

        List<Recommended> list = recommendedService.selectByExample(example);
        page.callbang(totat);
        if (list != null && list.size()>0){
            d.addObject("code",list);
        }
        d.setViewName("companyy");
        return d;
    }
}
