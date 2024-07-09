package com.hisyam.springboot.demo.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("in baseball ocach" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "baseball workout";
    }
}
