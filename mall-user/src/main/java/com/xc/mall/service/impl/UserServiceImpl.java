package com.xc.mall.service.impl;

import com.xc.mall.constant.ExceptionMessage;
import com.xc.mall.mapper.UserMapper;
import com.xc.mall.pojo.User;
import com.xc.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chujian
 * @ClassName UserServiceImpl
 * @Description 功能描述
 * @date 2019/6/9 12:30
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(String id) throws Exception {

        if (id == null) {
            throw new Exception(ExceptionMessage.ILLEGAL_PARAMETER);
        }

        User user = userMapper.selectByPrimaryKey(id);

        return user;
    }
}
    