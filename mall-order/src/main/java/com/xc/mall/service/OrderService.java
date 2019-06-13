package com.xc.mall.service;

import com.xc.mall.pojo.Item;
import com.xc.mall.pojo.dto.OrderConditionDTO;
import com.xc.mall.pojo.vo.OrderVO;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

/**
 * @author chujian
 * @ClassName OrderService
 * @Description 功能描述
 * 订单服务
 * @date 2019/6/11 13:51
 */
public interface OrderService {

    /**
     * 查询订单的详细信息
     *
     * @param dto  订单查询条件
     * @throws Exception
     */
    OrderVO queryOrderDetail(OrderConditionDTO dto) throws Exception;

    /**
     * 根据订单id查询关联的商品信息
     * @param id
     * @return
     * @throws Exception
     */
    List<Item> queryOrderRelateItems(Integer id) throws Exception;

    /**
     * 根据订单查询关联商品的信息，这个只是一个测试
     * @param id
     * @return
     * @throws Exception
     */
    List<Item> queryOrderRelateItems2(Integer id) throws Exception;
}
    