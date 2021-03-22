package com.schedule.app;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
@Controller
public class DeleteController{

    @Autowired
    ScheduleRepository scheduleRepository;

    @RequestMapping("/delete")
    public ModelAndView delTop(ModelAndView mav, @RequestParam(name="delete_id",defaultValue="") String delete_id){
        mav.setViewName("top");

        if(delete_id.equals("")){
            return mav;
        }
        mav.setViewName("delete");
        Integer id = Integer.parseInt(delete_id);
        ScheduleData delInstance = scheduleRepository.getOne(id);
        mav.addObject("delInstance", delInstance);
        return mav;
  }

    @RequestMapping("/delete/del")
    public String delete(ModelAndView mav, @RequestParam(name="del-id", defaultValue="") String delId){
        mav.setViewName("top");
        if(delId.equals("")){
            return "redirect:../top";
        }
        Integer id = Integer.parseInt(delId);
        ScheduleData target = scheduleRepository.getOne(id);
        scheduleRepository.delete(target);
        return "redirect:../top";
  }  


    
}

