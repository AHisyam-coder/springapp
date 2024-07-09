package com.hisyam.springboot.demo.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("in " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "tennis workout";
    }
}
