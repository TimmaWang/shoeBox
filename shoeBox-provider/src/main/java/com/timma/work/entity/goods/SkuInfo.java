package com.timma.work.entity.goods;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Description:
 * @Author: hzwangzhichao1@corp.netease.com
 * @Date: 2017/11/20
 */
public class SkuInfo implements Serializable{

    private static final long serialVersionUID = -5279615336420257391L;

    /**
     * 商品前台id
     */
    private Long goodsId;

    /**
     * sku ID
     */
    private String skuId ;


    /**
     *  市场价.
     */
    private BigDecimal marketPrice;

    /**
     * 在线指导价.
     */
    private BigDecimal suggestPrice;

    /**
     * 供应商价
     */
    private BigDecimal supplierPrice;


    // 申报数量.
    private BigDecimal declareGoodsCount;


    /*
     * sku属性id串，从小到大以_串起来  如 :_2411_13656_86668
     */
    private String skuPropervalueIdString = "";

    /**
     * 属性id列表
     */
    private List<String> skuPropervalueIdList ;

   /**
     * sku对应的具体销售属性
     */
    private List<SkuPropertyValue>  skuPropertyList;

}
