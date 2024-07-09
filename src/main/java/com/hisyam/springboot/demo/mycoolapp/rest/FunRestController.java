package com.hisyam.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return coachName + teamName;
    }

    //    expose "/" that return hello world
    @GetMapping("/")
    public String sayHello() {
        return "coes";
    }

    //expose new endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "run";
    }

    // expose new endpoint for fortune
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "fortune";
    }
}
