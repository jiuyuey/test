package controller;

import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pojo.Students;
import pojo.StudentsExample;
import service.serivcelmpe.StudentsServiceImpe;
import util.Page;

import java.util.List;

@Controller
public class HomePageController {

    org.apache.log4j.Logger logger = Logger.getLogger(HomePageController.class);

    @Autowired
    private StudentsServiceImpe studentsService;

    @RequestMapping(value = "/",method = RequestMethod.GET)//直接登录首页
    public ModelAndView head(){
        ModelAndView ssr = new ModelAndView();
        StudentsExample example = new StudentsExample();

        example.setOrderByClause("salary DESC");//按照工资的递减排列

        Page page = new Page();
        page.setPageSize(4);//定死只有四人
        page.setStart(0);
        long totat = studentsService.countByExample(example);//计数
        PageHelper.offsetPage(page.getStart(),page.getPageSize());

        List<Students> dd = studentsService.selectByExample(example);
        page.callbang(totat);

        logger.info("判断返回的集合是否符合");
        if (dd != null && dd.size() == 4){
            ssr.addObject("dd",dd);
            ssr.setViewName("index");
        }
        return ssr;
    }
}
