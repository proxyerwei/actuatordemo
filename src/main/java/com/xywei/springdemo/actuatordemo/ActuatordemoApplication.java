package com.xywei.springdemo.actuatordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ActuatordemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatordemoApplication.class, args);
    }

}
