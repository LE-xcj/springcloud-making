package com.xc.mall.feign;

import com.xc.mall.pojo.Item;
import com.xc.mall.pojo.dto.ItemConditionDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author chujian
 * @ClassName ItemFeignClient
 * @Description 功能描述
 * @date 2019/6/11 17:11
 */
@FeignClient(value = "mall-item")
public interface ItemFeignClient {

    @RequestMapping(value = "/item/queryItemById")
    Item queryItemById (@RequestParam("id") Integer id) throws Exception;

    @RequestMapping(value = "/item/listItem")
    List<Item> listItem (@RequestBody ItemConditionDTO dto) throws Exception;

    @RequestMapping(value = "/item/listItemByCondition")
    List<Item> listItemByCondition (@RequestBody ItemConditionDTO dto) throws Exception;


}
    