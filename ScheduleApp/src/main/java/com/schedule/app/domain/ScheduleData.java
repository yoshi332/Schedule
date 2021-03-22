package com.schedule.app;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


 
@Entity
public class ScheduleData {
 
    @Id
    @GeneratedValue
    protected Integer id;
    protected String name;
    protected String mail;
    protected String tel;
    protected int age;
     
    public ScheduleData(){
    }
     
    public ScheduleData(String name, String mail,
            String tel, int age){
        this.name = name;
        this.mail = mail;
        this.tel = tel;
        this.age = age;
    }
     
    public String toString(){
        return "[name:" + name + ", mail:" + mail+
            ", tel:" + tel + ", age:" + age + "]";
    }
}
