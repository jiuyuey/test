package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pojo.Professional;
import pojo.ProfessionalExample;
import service.ProfessionalService;

import java.util.List;

@Controller
public class SecondController {

    @Autowired
    private ProfessionalService professionalService;

    @RequestMapping(value = "/job",method = RequestMethod.GET)
    public ModelAndView job(){
        ModelAndView jo = new ModelAndView();
        ProfessionalExample example = new ProfessionalExample();

//        Page page = new Page();
//        page.setPageSize(11);//定死只有11人
//        page.setStart(0);
//        long totat = professionalService.countByExample(example);//计数
//        PageHelper.offsetPage(page.getStart(),page.getPageSize());

        List<Professional> list = professionalService.selectByExample(example);
//        page.callbang(totat);
        if (list != null && list.size() != 0 ){
            jo.addObject("cc",list);
            jo.addObject("ee",list);
            jo.addObject("ff",list);
            jo.addObject("gg",list);
            jo.addObject("hh",list);
        }
        jo.setViewName("job");
        return jo;
    }

}
