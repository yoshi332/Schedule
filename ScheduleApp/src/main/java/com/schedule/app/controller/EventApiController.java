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



@RestController
public class EventApiController {

    @Autowired
    ScheduleRepository scheduleRepository;

    @RequestMapping("/api/events")
    public String getEvents() {
        String jsonMsg = null;
        try {
            List<Event> events = new ArrayList<Event>();
         
            Iterable<ScheduleData> entity = scheduleRepository.findAll();
            for(ScheduleData data: entity){
                Event event = new Event(data.title, data.date);
                events.add(event);
            }

            // FullCalendarにエンコード済み文字列を渡す
            ObjectMapper mapper = new ObjectMapper();
            jsonMsg =  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(events);
        } catch (IOException ioex) {
            System.out.println(ioex.getMessage());
        }
        return jsonMsg;
    }
}
