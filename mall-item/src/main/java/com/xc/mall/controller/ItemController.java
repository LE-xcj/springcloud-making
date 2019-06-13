package com.xc.mall.controller;

import com.xc.mall.pojo.Item;
import com.xc.mall.pojo.dto.ItemConditionDTO;
import com.xc.mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chujian
 * @ClassName ItemController
 * @Description 功能描述
 * @date 2019/6/11 15:59
 */

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;


    @RequestMapping("/queryItemById")
    public Item queryItemById(@RequestParam("id") Integer id) throws Exception {

        Item item = itemService.queryItemById(id);
        return item;

    }

    @RequestMapping("/listItem")
    public List<Item> listItem(@RequestBody ItemConditionDTO dto) throws Exception {

        List<Integer> ids = dto.getIds();
        List<Item> items = itemService.listItem(ids);

        return items;

    }

    @RequestMapping("/listItemByCondition")
    public List<Item> listItemByCondition(@RequestBody ItemConditionDTO dto) throws Exception {
        List<Item> items = itemService.listItem(dto);
        return items;
    }


}
    