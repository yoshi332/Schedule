package com.schedule.app;

public class Event{
    private Integer id;
    private String title;
    private String date;

    public Event(Integer id, String title, String date){
        this.id = id;
        this.title = title;
        this.date = date;
    }

    public String getTitle(){
        return this.title;
    }

    public String getDate(){
        return this.date;
    }

    public Integer getId(){
        return this.id;
    }


    public void setId(Integer id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDate(String date){
        this.date = date;
    }
}
