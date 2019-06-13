package com.xc.mall.pojo.dto;

import com.xc.mall.pojo.Item;

import java.util.List;

/**
 * @author chujian
 * @ClassName ItemConditionDTO
 * @Description 功能描述
 * @date 2019/6/11 16:14
 */
public class ItemConditionDTO {

    // 用于批量查询
    private List<Integer> ids;

    // 用于填充商品查询条件
    private Item item;

    // 起始页
    private int begin;

    // 一页显示的数据量
    private int size;

    // 是否降序
    private boolean desc;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
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

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "ItemConditionDTO{" +
                "item=" + item +
                ", begin=" + begin +
                ", size=" + size +
                ", desc=" + desc +
                '}';
    }
}
    