package com.xywei.springdemo.actuatordemo.service;

import com.xywei.springdemo.actuatordemo.dto.BaseResult;
import com.xywei.springdemo.actuatordemo.entity.User;

import java.util.List;

public interface UserService {
    BaseResult<List<User>> findUserById(String userId);
}
