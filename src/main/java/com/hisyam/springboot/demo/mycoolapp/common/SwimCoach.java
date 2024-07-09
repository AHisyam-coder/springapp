package com.hisyam.springboot.demo.mycoolapp.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("swim " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "swim 1000 meters";
    }
}
