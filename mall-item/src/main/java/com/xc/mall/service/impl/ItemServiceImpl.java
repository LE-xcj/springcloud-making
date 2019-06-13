package com.xc.mall.service.impl;

import com.xc.mall.constant.ExceptionMessage;
import com.xc.mall.pojo.Item;
import com.xc.mall.pojo.dto.ItemConditionDTO;
import com.xc.mall.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chujian
 * @ClassName ItemServiceImpl
 * @Description 功能描述
 * @date 2019/6/11 16:10
 */
@Service
public class ItemServiceImpl implements ItemService {

    /**
     * 根据商品的id查询
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public Item queryItemById(Integer id) throws Exception {

        if (checkIllegal(id)) {
            throw new Exception(ExceptionMessage.ILLEGAL_PARAMETER);
        }

        return generateItem(id);
    }


    /**
     * 根据商品的id集合批量查询信息
     * @param ids
     * @return
     * @throws Exception
     */
    @Override
    public List<Item> listItem(List<Integer> ids) throws Exception {

        if (null == ids) {
            throw new Exception(ExceptionMessage.ILLEGAL_PARAMETER);
        }

        // 检测id的合法性
        List<Item> items = new ArrayList<>();
        for (Integer id : ids) {
            if (checkIllegal(id)) {
                throw new Exception(ExceptionMessage.ILLEGAL_PARAMETER);
            } else {
                items.add(generateItem(id));
            }
        }

        return items;
    }

    /**
     * 根据条件查询
     * @param dto
     * @return
     * @throws Exception
     */
    @Override
    public List<Item> listItem(ItemConditionDTO dto) throws Exception {

        System.out.println(dto);

        return new ArrayList<>();
    }

    private boolean checkIllegal(Integer id) {

        if (null == id || id < 0) {
            return true;
        }
        return false;

    }


    /**
     * 造假数据
     * @param id
     * @return
     */
    private Item generateItem(Integer id) {

        Item item = new Item();
        item.setId(id);
        item.setName("item" + id);
        item.setDescription("this is null");

        return item;
    }

}
    