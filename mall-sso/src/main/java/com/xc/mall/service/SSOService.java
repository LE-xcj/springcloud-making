package com.xc.mall.service;

import com.xc.mall.pojo.ResponseCode;
import com.xc.mall.pojo.User;
import com.xc.mall.pojo.vo.UserVO;

/**
 * @author chujian
 * @ClassName SSOService
 * @Description 功能描述
 * 单点登录的业务层
 * @date 2019/6/9 12:43
 */
public interface SSOService {

    /**
     * 登录状态返回
     * @param id
     * @param psw
     * @return
     * @throws Exception
     */
    ResponseCode login(String id, String psw) throws Exception;

    /**
     * 根据id查询用户的信息
     * @param id
     * @return
     * @throws Exception
     */
    UserVO queryUser(String id) throws Exception;


}
