package com.timma.work.model.goods;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description:
 * @Author: hzwangzhichao1@corp.netease.com
 * @Date: 2017/11/20
 */
public class GoodsInfoBase implements Serializable{

    private static final long serialVersionUID = 5389891466588425319L;

    private String goodsId;

    private String title;

    private String subTititle;

    private String description;

    private String imageUrl;

    private BigDecimal price;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTititle() {
        return subTititle;
    }

    public void setSubTititle(String subTititle) {
        this.subTititle = subTititle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
