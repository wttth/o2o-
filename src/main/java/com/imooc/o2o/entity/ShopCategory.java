package com.imooc.o2o.entity;

import java.util.Date;

public class ShopCategory {
    // Primary Key
    private Long shopCategoryId;
    // 类别名
    private String shopCategoryName;
    // 类别描述
    private String shopCategoryDesc;
    // 类别图片地址(针对一级类别)
    private String shopCategoryImg;
    // 权重，越大越排前显示
    private Integer priority;

    private Date createTime;

    private Date lastEditTime;
    // 父类别
    private ShopCategory parent;

    public Long getShopCategoryId() {
        return shopCategoryId;
    }
    public void setShopCategoryId(Long shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
    }
    public String getShopCategoryName() {
        return shopCategoryName;
    }
    public void setShopCategoryName(String shopCategoryName) {
        this.shopCategoryName = shopCategoryName;
    }
    public String getShopCategoryDesc() {
        return shopCategoryDesc;
    }
    public void setShopCategoryDesc(String shopCategoryDesc) {
        this.shopCategoryDesc = shopCategoryDesc;
    }
    public String getShopCategoryImg() {
        return shopCategoryImg;
    }
    public void setShopCategoryImg(String shopCategoryImg) {
        this.shopCategoryImg = shopCategoryImg;
    }
    public Integer getPriority() {
        return priority;
    }
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getLastEditTime() {
        return lastEditTime;
    }
    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
    public ShopCategory getParent() {
        return parent;
    }
    public void setParent(ShopCategory parent) {
        this.parent = parent;
    }
}
