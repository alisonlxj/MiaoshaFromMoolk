package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;

public interface OrderService {
    // 人推荐1. 通过前端url上传过来秒杀活动id，然后下单接口内校验对应ID是否属于对应活动且一开始
    // 2. 直接在下单接口内对应的商品是否存在秒杀活动，若存在则秒杀价格下单
    OrderModel createOrder(Integer userId, Integer itemId, Integer promoId, Integer amount) throws BusinessException;

}
