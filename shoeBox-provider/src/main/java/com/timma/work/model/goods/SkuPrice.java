package com.timma.work.model.goods;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description:
 * @Author: hzwangzhichao1@corp.netease.com
 * @Date: 2017/11/20
 */
public class SkuPrice implements Serializable{

    private static final long serialVersionUID = -3451472688195493497L;

    private String skuId;

    private BigDecimal currentPrice;

    private BigDecimal marketPrice;

    private BigDecimal suggestPrice;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getSuggestPrice() {
        return suggestPrice;
    }

    public void setSuggestPrice(BigDecimal suggestPrice) {
        this.suggestPrice = suggestPrice;
    }
}
