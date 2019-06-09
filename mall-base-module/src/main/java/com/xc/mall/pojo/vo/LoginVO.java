package com.xc.mall.pojo.vo;

import com.xc.mall.pojo.ResponseCode;
import com.xc.mall.pojo.User;

/**
 * @author chujian
 * @ClassName LoginVo
 * @Description 功能描述
 * @date 2019/6/9 17:10
 */
public class LoginVO {

    private ResponseCode code;

    private User user;

    private String message;


    public ResponseCode getCode() {
        return code;
    }

    public void setCode(ResponseCode code) {
        this.code = code;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
    