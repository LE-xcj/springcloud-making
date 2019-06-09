package com.xc.mall.controller;

import com.xc.mall.constant.Code;
import com.xc.mall.pojo.ResponseCode;
import com.xc.mall.pojo.User;
import com.xc.mall.pojo.vo.UserVO;
import com.xc.mall.service.SSOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chujian
 * @ClassName SSOController
 * @Description 功能描述
 * @date 2019/6/9 12:30
 */
@RestController
@RequestMapping("/sso")
public class SSOController {

    @Autowired
    private SSOService ssoService;

    @RequestMapping("/getUser/{id}/{psw}")
    public UserVO getUser(@PathVariable("id") String id, @PathVariable("psw") String psw) throws Exception {

        UserVO user = null;
        ResponseCode login = ssoService.login(id, psw);

        // 匹配成功
        if (Code.OK == login.getCode()) {
            System.out.println("login success");
            user = ssoService.queryUser(id);
        }

        return user;
    }

}
    