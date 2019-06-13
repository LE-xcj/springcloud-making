package com.xc.mall.feign;

import com.xc.mall.pojo.User;
import com.xc.mall.pojo.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chujian
 * @ClassName UserFeignClient
 * @Description 功能描述
 * @date 2019/6/13 14:25
 */
@FeignClient(value = "mall-user")
public interface UserFeignClient {

    @RequestMapping("/user/queryUser")
    UserVO queryUser(@PathVariable("id") String id) throws Exception;

    @RequestMapping("/user/queryUser2")
    UserVO queryUser2(@RequestParam("id") String id) throws Exception;
}
    