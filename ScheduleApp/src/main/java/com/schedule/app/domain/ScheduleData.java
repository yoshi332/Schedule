package com.schedule.app;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


 
@Entity
public class ScheduleData {
 
    @Id
    @GeneratedValue
    protected Integer id;
    protected String title;
    protected String start;
    protected String end;

     
    public ScheduleData(){
    }
     
    public ScheduleData(String title, String start,String end){
        this.title = title;
        this.start = start;
        this.end = end;
    
    }
     
    //getter メソッド
    public String getTitle(){
        return this.title;
    }

    public String getStart(){
        return this.start;
    }

    public String getEnd(){
        return this.end;
    }

    //setter メソッド
    public void setTitle(String title){
        this.title = title;
    }

    public void setStart(String start){
        this.start = start;
    }

    public void setEnd(String end){
        this.end = end;
        
    }
}
