package com.xc.mall.service;

import com.xc.mall.pojo.Item;
import com.xc.mall.pojo.dto.ItemConditionDTO;

import java.util.List;

/**
 * @author chujian
 * @ClassName ItemService
 * @Description 功能描述
 * 商品服务
 * @date 2019/6/11 16:10
 */
public interface ItemService {

    /**
     * 根据id查询商品
     * @param id
     * @return
     * @throws Exception
     */
    Item queryItemById (Integer id) throws Exception;

    /**
     * 根据多个id批量查询商品信息
     * @param ids
     * @return
     * @throws Exception
     */
    List<Item> listItem (List<Integer> ids) throws Exception;

    /**
     * 根据条件查询满足要求的商品信息
     * @param dto
     * @return
     * @throws Exception
     */
    List<Item> listItem (ItemConditionDTO dto) throws Exception;

}
    