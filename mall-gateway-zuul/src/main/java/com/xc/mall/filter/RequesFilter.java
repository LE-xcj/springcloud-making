package com.xc.mall.filter;

import com.netflix.discovery.util.StringUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author chujian
 * @ClassName RequesFilter
 * @Description 功能描述
 * @date 2019/6/9 23:23
 */
@Component
public class RequesFilter extends ZuulFilter {

    /**
     * 路由之前
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否需要过滤，true：需要过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤的业务逻辑
     * 过滤规则
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {

        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

        String token = request.getParameter("token");
        Object flag = request.getAttribute("flag");

        if (null == token || token.equals("fuck")) {

            // 不继续转发请求到目的服务器
            currentContext.setSendZuulResponse(false);

            // 响应
            currentContext.setResponseStatusCode(401);
            currentContext.setResponseBody("token is unvalid");

            return null;
        }

        return null ;

    }
}
    