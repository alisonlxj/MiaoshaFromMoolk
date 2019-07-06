package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.ItemModel;

import java.util.List;

public interface ItemService {

    // 创建商品
    public ItemModel createItem(ItemModel itemModel) throws BusinessException;

    // 浏览商品列表
    public List<ItemModel> listItem();

    // 通过id获取商品详情
    public ItemModel getItemById(Integer id);

}
