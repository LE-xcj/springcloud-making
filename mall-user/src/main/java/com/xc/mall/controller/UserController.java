package com.xc.mall.controller;

import com.xc.mall.pojo.User;
import com.xc.mall.pojo.vo.UserVO;
import com.xc.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;

/**
 * @author chujian
 * @ClassName UserController
 * @Description 功能描述
 * @date 2019/6/9 15:57
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/queryUser/{id}")
    public UserVO queryUser(@PathVariable("id") String id, HttpServletRequest request) throws Exception {

        User user = userService.queryUserById(id);

        UserVO vo = new UserVO();
        vo.setUser(user);
        vo.setMessage(getSystemInfo(request));

        return vo;
    }


    private String getSystemInfo(HttpServletRequest request) throws UnknownHostException {

        StringBuilder message = new StringBuilder();

        String serverName = request.getServerName();
        int serverPort = request.getServerPort();

        message.append(serverName)
                .append(":")
                .append(serverPort)
                .append(" 机器为你服务")
                .append("\n");

        return message.toString();


    }


}
    