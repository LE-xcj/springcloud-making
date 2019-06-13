package com.xc.mall.controller;

import com.sun.corba.se.impl.resolver.ORBDefaultInitRefResolverImpl;
import com.xc.mall.pojo.Item;
import com.xc.mall.pojo.dto.OrderConditionDTO;
import com.xc.mall.pojo.vo.OrderVO;
import com.xc.mall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/queryOrderDetail")
    public OrderVO queryOrderDetail(OrderConditionDTO dto) throws Exception {
        return orderService.queryOrderDetail(dto);
    }

    @RequestMapping("/queryOrderRelateItems")
    public List<Item> queryOrderRelateItems(Integer id) throws Exception {

        return orderService.queryOrderRelateItems(id);
    }

    @RequestMapping("/queryOrderRelateItems2")
    public List<Item> queryOrderRelateItems2(Integer id) throws Exception {

        return orderService.queryOrderRelateItems2(id);
    }

}
    