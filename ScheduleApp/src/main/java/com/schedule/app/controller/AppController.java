package com.schedule.app;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
@Controller
public class AppController{

    @RequestMapping("/top")
    public ModelAndView top(ModelAndView mav){
        mav.setViewName("top");
        return mav;
    }

}
