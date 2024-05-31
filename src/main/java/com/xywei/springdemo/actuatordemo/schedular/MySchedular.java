package com.xywei.springdemo.actuatordemo.schedular;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class MySchedular {
    @Scheduled(cron = "0/15 * * * * *")
    public void test1() {
        System.out.println(Calendar.getInstance().getTime().toString() + "----cron");
    }
}
