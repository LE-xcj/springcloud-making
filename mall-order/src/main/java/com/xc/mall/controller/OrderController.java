package com.xc.mall.controller;

import com.sun.corba.se.impl.resolver.ORBDefaultInitRefResolverImpl;
import com.xc.mall.pojo.Item;
import com.xc.mall.pojo.dto.OrderConditionDTO;
import com.xc.mall.pojo.vo.OrderVO;
import com.xc.mall.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chujian
 * @ClassName OrderController
 * @Description 功能描述
 * @date 2019/6/11 13:48
 */

@RestController
@RequestMapping("/order")
@Api(value = "订单调用接口")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/queryOrderDetail")
    public OrderVO queryOrderDetail(OrderConditionDTO dto) throws Exception {
        return orderService.queryOrderDetail(dto);
    }

    @GetMapping("/queryOrderRelateItems")
    // 方法接口说明
    @ApiOperation(value = "查询关联的商品信息", notes = "根据订单id查询关联的商品信息")
    // 多个参数说明
    @ApiImplicitParams(
            // 单个
            @ApiImplicitParam(value = "订单id")
    )
    public List<Item> queryOrderRelateItems(Integer id) throws Exception {

        return orderService.queryOrderRelateItems(id);
    }

    @GetMapping("/queryOrderRelateItems2")
    public List<Item> queryOrderRelateItems2(Integer id) throws Exception {

        return orderService.queryOrderRelateItems2(id);
    }

}
    