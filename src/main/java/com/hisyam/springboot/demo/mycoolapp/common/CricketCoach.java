package com.hisyam.springboot.demo.mycoolapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("in " + getClass().getSimpleName());
    }

    //define init method
//    @PostConstruct
//    public void doMyStartupStuff() {
//        System.out.println("in init" + getClass().getSimpleName());
//    }
//
//    @PreDestroy
//    public void doMyCleanupStuff() {
//        System.out.println("in cleanup" + getClass().getSimpleName());
//    }

    //define destroy method
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 mins1";
    }
}
