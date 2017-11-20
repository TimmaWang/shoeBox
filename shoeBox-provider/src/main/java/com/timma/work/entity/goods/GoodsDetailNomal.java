package com.timma.work.entity.goods;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: 商品模型
 *
 * @Author: hzwangzhichao1@corp.netease.com
 * @Date: 2017/11/20
 */
public class GoodsDetailNomal implements Serializable{

    private static final long serialVersionUID = -2922580901204516285L;

    /**
     * 商品id
     */
    private Long goodsId;

    /**
     * 当前商品最小价格的sku
     */
    private String minPriceSkuId;

    /**
     * 商品基础信息
     */
    private GoodsInfoBase goodsInfoBase;


    /**
     * 价格最低的sku
     */
    private SkuPrice skuPrice;

    /**
     * 商品的总库存  sku相加
     */
    private int goodsCurrentStore;

    /**
     * 总的库存状态，只要一个sku有库存就有库存
     */
    private boolean goodsStoreStatus ;


    /**
     * sku信息
     */
    private List<SkuInfo>  skuInfoList;


    /**
     * 品牌id
     */
    private  String brandId ;


}
