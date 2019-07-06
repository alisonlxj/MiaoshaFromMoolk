package com.miaoshaproject.controller.viewobject;


import java.math.BigDecimal;

public class ItemVO {

    private Integer id;

    // 商品名称
    private String title;

    // 价格
    // 这里必须是BigDecimal类型，因为java后台转到前端会有精度损失，这是一种止损的措施（类似于stringfy()这种函数有损失）
    private BigDecimal price;

    // 库存
    private Integer stock;

    // 文字描述
    private String description;

    // 销量
    private Integer sales;

    private String imgUrl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
