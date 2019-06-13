package com.xc.mall.pojo.vo;

import com.xc.mall.pojo.Item;
import com.xc.mall.pojo.Order;
import com.xc.mall.pojo.User;

import java.util.List;

/**
 * @author chujian
 * @ClassName OrderVO
 * @Description 功能描述
 * @date 2019/6/13 14:23
 */
public class OrderVO {

    private Order order;

    private List<Item> items;

    private User user;

    private String message;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
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
    