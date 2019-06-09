package com.xc.mall.pojo;

/**
 * @author chujian
 * @ClassName ResponseCode
 * @Description 功能描述
 * @date 2019/6/9 15:01
 */
public class ResponseCode {
    private int code;
    private String tip;


    public ResponseCode() {
    }

    public ResponseCode(String tip) {
        this.tip = tip;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
    