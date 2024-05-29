package com.xywei.springdemo.actuatordemo.service.impl;

import com.xywei.springdemo.actuatordemo.dto.BaseResult;
import com.xywei.springdemo.actuatordemo.dto.ResultEnum;
import com.xywei.springdemo.actuatordemo.entity.User;
import com.xywei.springdemo.actuatordemo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public BaseResult<List<User>> findUserById(String userId) {
        BaseResult result = new BaseResult();
        if (ObjectUtils.isEmpty(userId)) {
            result.setResultCode(ResultEnum.EMPTY.getCode());
            result.setResultMessage(ResultEnum.EMPTY.getMessage());
            return result;
        }
        String userStrs = UUID.randomUUID().toString();
        List<User> users = List.of(new User(userId + ":" + userStrs, "username:" + userStrs));
        result.setResultData(users);
        result.setResultCode(ResultEnum.SUCCESS.getCode());
        result.setResultMessage(ResultEnum.SUCCESS.getMessage());
        return result;
    }
}
