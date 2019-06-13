package com.xc.mall.pojo.dto;

import com.xc.mall.pojo.Order;

import java.util.List;

/**
 * @author chujian
 * @ClassName OrderConditionDTO
 * @Description 功能描述
 * @date 2019/6/11 17:08
 */
public class OrderConditionDTO {


    private Order order;

    private int begin;
    private int size;

    private boolean desc;


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isDesc() {
        return desc;
    }

    public void setDesc(boolean desc) {
        this.desc = desc;
    }
}
    