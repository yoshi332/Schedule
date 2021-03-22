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
    protected String date;
 

     
    public ScheduleData(){
    }
     
    public ScheduleData(String title){
        this.title = title;

    
    }
    public ScheduleData(String title, String date){
        this.title = title;
        this.date = date;
 
    
    }
     
    //getter メソッド
    public String getTitle(){
        return this.title;
    }

    public String getDate(){
        return this.date;
    }



    //setter メソッド
    public void setTitle(String title){
        this.title = title;
    }

  
    public void setDate(String date){
        this.date = date;

    }
}
