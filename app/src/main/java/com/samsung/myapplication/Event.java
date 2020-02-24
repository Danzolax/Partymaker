package com.samsung.myapplication;

import android.widget.ImageView;

public class Event {
    String position;
    String age;
    String name;
    String time;
    String date;
    String place;
    int imageId;
    public Event(String position,String age,String name, String time, String date, String place,int imageId){
        this.position = position;
        this.age = age;
        this.name = name;
        this.time = time;
        this.date = date;
        this.place = place;
        this.imageId = imageId;
    }
}
