package com.example.helloworld;
import java.util.Date;
public class Controller {
    int a;
    Date date = new Date();
    public String hello(String name){
        return name + "，<font color='red'>您好：</font>" + date.getTime();
    }

}