package com.hisyam.springboot.demo.mycoolapp.rest;

import com.hisyam.springboot.demo.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define  private field
    private Coach myCoach;
//    private Coach anotherCoach;

    //constructor injection
//    @Autowired
//    public DemoController(@Qualifier("cricketCoach") Coach theCoach,
//                          @Qualifier("cricketCoach") Coach theAnotherCoach){
//        System.out.println("in " + getClass().getSimpleName());
//        myCoach = theCoach;
//        anotherCoach = theAnotherCoach;
//    }
    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach) {
        System.out.println("in " + getClass().getSimpleName());
        myCoach = theCoach;
    }

//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

//    @GetMapping("/check")
//    public String check(){
//        return "compare mr beans " + (myCoach == anotherCoach);
//    }
}
