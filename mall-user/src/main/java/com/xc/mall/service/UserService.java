package com.xc.mall.service;

import com.xc.mall.pojo.User;

/**
 * @author chujian
 * @ClassName UserService
 * @Description 功能描述
 * 用户的业务层
 * @date 2019/6/9 12:29
 */
public interface UserService {


    /**
     * 根据用户id查询
     * 如果查询不到，返回null
     * @param id
     * @return
     * @throws Exception
     */
    User queryUserById(String id) throws Exception;

}
