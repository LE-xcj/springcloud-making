# springcloud学习

## springcloud组件：
本工程运用的组件：
- Eureka作为注册中心（多个Eureka运行，搭建高可用注册中心）
- Zuul作为所有微服务的网关（设置网关过滤所有请求，并转发请求到对应的服务系统）
- Feign和Ribbon来调用其他系统的服务（Feign是在Ribbon的基础上进行的封装，能够传输实体类）
- Hystrix提供服务熔断，防止服务雪崩

## 模块介绍：
- mall-base-module：所有模块的基础模块，包含一些共用的类
- mall-eureka-node：注册中心服务
- mall-gateway-zuul：网关服务（设置过滤器）
- mall-item：商品服务
- mall-order：订单服务
- mall-sso：单点登录服务 
- mall-user：用户服务

## 项目介绍：
在订单服务中，调用了用户和商品服务（采用Feign来实现）
