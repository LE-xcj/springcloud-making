package com.xc.mall.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.xc.mall.constant.Code;
import com.xc.mall.constant.CorrectMessage;
import com.xc.mall.constant.ExceptionMessage;
import com.xc.mall.constant.ServiceURL;
import com.xc.mall.mapper.LoginMapper;
import com.xc.mall.pojo.Login;
import com.xc.mall.pojo.ResponseCode;
import com.xc.mall.pojo.User;
import com.xc.mall.pojo.vo.UserVO;
import com.xc.mall.service.SSOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author chujian
 * @ClassName SSOServiceImpl
 * @Description 功能描述
 * @date 2019/6/9 12:43
 */
@Service
public class SSOServiceImpl implements SSOService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public ResponseCode login(String id, String psw) throws Exception {

        ResponseCode responseCode = new ResponseCode();

        // 检查参数是否合法
        if (null == id || psw == null) {
            responseCode.setTip(ExceptionMessage.ILLEGAL_PARAMETER);
        } else {

            // 从数据库中查询
            Login login = loginMapper.selectByPrimaryKey(id);

            if (null == login) {
                // 用户不存在
                responseCode.setTip(ExceptionMessage.UNEXIST_USER);

            } else if (!psw.equals(login.getPsw())){
                // 密码错误
                responseCode.setTip(ExceptionMessage.WRONG_PSW);

            } else {
                // 用户和密码匹配
                responseCode.setTip(CorrectMessage.MATCH_ID_PSW);
                responseCode.setCode(Code.OK);
            }

        }

        return responseCode;
    }


    @Autowired
    private RestTemplate restTemplate;

    // 进行容错处理，再次调用
    @HystrixCommand(fallbackMethod = "retryQueryUser")
    public UserVO queryUser(String id) throws Exception{

        /**
         * ServiceURL.USER_SERVICE_URL：就是应用名
         * 后面都是路径，RequestMapping。
         * 因为springcloud之间的服务调用就是通过RESTful来进行的时
         * UserVO.class：就是通过类模板将返回类型进行重组
         */

        UserVO user = restTemplate.getForObject(ServiceURL.USER_SERVICE_URL + "/user/queryUser/" + id, UserVO.class);

        return user;
    }

    /**
     * 集群中的某台服务宕机了，采用尝试方式来保证高可用
     * 注意：该方法的入参、返回参数一定要与queryUser一致。
     * 这样一旦queryUser调用其他服务方法失败时，就会熔断，然后调用retryQueryUser
     * @param id
     * @return
     * @throws Exception
     */
    public UserVO retryQueryUser(String id) throws Exception {

        System.out.println("retry query....");
        return queryUser(id);

    }

}
    