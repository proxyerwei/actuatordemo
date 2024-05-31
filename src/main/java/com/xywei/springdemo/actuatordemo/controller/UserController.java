package com.xywei.springdemo.actuatordemo.controller;

import com.xywei.springdemo.actuatordemo.dto.BaseResult;
import com.xywei.springdemo.actuatordemo.entity.User;
import com.xywei.springdemo.actuatordemo.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/user/findUser")
    public BaseResult<List<User>> findUserById(String userId) {
        return userService.findUserById(userId);
    }

    @GetMapping("/user/sleep")
    public void userSleep(String userId) {
        System.out.println(Calendar.getInstance().getTime() + "-----sleep 10s------");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Calendar.getInstance().getTime() + "-----sleep 10s done------");
    }
}
