package com.schedule.app;

public class Event{
    private String title;
    private String date;

    public Event(String title, String date){
        this.title = title;
        this.date = date;
    }

    public String getTitle(){
        return this.title;
    }

    public String getDate(){
        return this.date;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDate(String date){
        this.date = date;
    }
}
