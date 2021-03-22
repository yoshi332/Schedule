package com.schedule.app;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
@Controller
public class RegistController{

    @Autowired
    ScheduleRepository scheduleRepository;

    @RequestMapping("/register")
    public ModelAndView regist(ModelAndView mav, @RequestParam(defaultValue = "NO PARAM") String date){
        mav.setViewName("register");
        mav.addObject("date",date);
        return mav;
  }

    @RequestMapping("/register/create")
    public ModelAndView regist(ModelAndView mav, @RequestParam("schedule") String schedule, @RequestParam("start") String start,@RequestParam("end") String end,@RequestParam("date") String date){
        mav.setViewName("register");
        String title = schedule + " "+start + "~" + end;
        ScheduleData sd = new ScheduleData(title,date);
        scheduleRepository.saveAndFlush(sd);
        return mav;
  }
    
}
