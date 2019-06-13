package com.xc.mall.service.impl;

import com.xc.mall.feign.ItemFeignClient;
import com.xc.mall.feign.UserFeignClient;
import com.xc.mall.pojo.Item;
import com.xc.mall.pojo.User;
import com.xc.mall.pojo.dto.ItemConditionDTO;
import com.xc.mall.pojo.dto.OrderConditionDTO;
import com.xc.mall.pojo.vo.OrderVO;
import com.xc.mall.pojo.vo.UserVO;
import com.xc.mall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chujian
 * @ClassName OrderServiceImpl
 * @Description 功能描述
 * @date 2019/6/11 13:51
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ItemFeignClient itemFeignClient;

    @Autowired
    private UserFeignClient userFeignClient;

    /**
     * 查询订单的详细信息
     *
     * @param dto  订单查询条件
     * @throws Exception
     */
    @Override
    public OrderVO queryOrderDetail(OrderConditionDTO dto) throws Exception {

        // 模拟通过订单id获取订单关联的商品id集合
        List<Integer> ids = simulate(dto.getOrder().getId());

        // 将商品id集合进行包装
        ItemConditionDTO itemConditionDTO = new ItemConditionDTO();
        itemConditionDTO.setIds(ids);

        // 调用mall-item模块的服务，批量查询商品信息
        List<Item> items = itemFeignClient.listItem(itemConditionDTO);

        // 调用mall-user模块的服务，根据用户id查询用户的信息
        UserVO userVO = userFeignClient.queryUser2(dto.getOrder().getUid());
        User user = userVO.getUser();

        // 将数据填充到order vo中
        OrderVO orderVO = new OrderVO();
        orderVO.setItems(items);
        orderVO.setUser(user);
        orderVO.setOrder(dto.getOrder());
        orderVO.setMessage(userVO.getMessage());

        return orderVO;
    }

    /**
     * 根据订单id查询关联的商品信息
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public List<Item> queryOrderRelateItems(Integer id) throws Exception {

        /**
         * 这里省略查询订单关联的商品id集合
         * simulate模拟从数据库获取得到的id集合
          */
        List<Integer> ids = simulate(id);

        // 将查询条件进行包装
        ItemConditionDTO dto = new ItemConditionDTO();
        dto.setIds(ids);

        // 调用mall-item模块的服务，返回商品的信息
        List<Item> items = itemFeignClient.listItem(dto);
        return items;
    }


    /**
     * 用于测试
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public List<Item> queryOrderRelateItems2(Integer id) throws Exception {

        List<Integer> ids = simulate(id);
        List<Item> items = new ArrayList<>();

        // 不断调用单个查询商品的接口
        for (Integer iid : ids) {
            Item item = itemFeignClient.queryItemById(iid);

            items.add(item);
        }


        return items;
    }

    /**
     * 用于模拟通过订单id获取关联的商品id集合
     * @param id
     * @return
     */
    private List<Integer> simulate(Integer id) {

        List<Integer> ids = new ArrayList<>();

        for (int i=0; i<5; ++i) {
            ids.add(i);
        }

        return ids;
    }


}
    