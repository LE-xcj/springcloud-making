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

// 这里是指item服务的应用名
@FeignClient(value = "mall-item")
public interface ItemFeignClient {

    /**
     * 注意添加注解进行参数绑定，在item的controller也是如此，一一对应
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/item/queryItemById")
    Item queryItemById (@RequestParam("id") Integer id) throws Exception;


    /**
     * 这里传输的是实体类，以json格式进行传输，所以要加上requestbody，同时item的controller也是如此
     * @param dto
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/item/listItem")
    List<Item> listItem (@RequestBody ItemConditionDTO dto) throws Exception;

    @RequestMapping(value = "/item/listItemByCondition")
    List<Item> listItemByCondition (@RequestBody ItemConditionDTO dto) throws Exception;


}
    