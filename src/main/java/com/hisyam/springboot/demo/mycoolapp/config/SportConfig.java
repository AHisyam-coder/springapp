package com.hisyam.springboot.demo.mycoolapp.config;

import com.hisyam.springboot.demo.mycoolapp.common.Coach;
import com.hisyam.springboot.demo.mycoolapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
