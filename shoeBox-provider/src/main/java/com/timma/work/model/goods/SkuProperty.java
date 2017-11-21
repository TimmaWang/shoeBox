package com.timma.work.model.goods;

import java.io.Serializable;
import java.util.List;

/**
 * @Description:
 *
 * @Author: hzwangzhichao1@corp.netease.com
 * @Date: 2017/11/20
 */
public class SkuProperty implements Serializable{
    private static final long serialVersionUID = -8118303248399144866L;

    private String propertyNameId;

    /**
     * 销售属性项名
     */
    private String propertyName ;


    /**
     * 是否颜色
     */
    private boolean isColor ;


    /**
     * 商品销售属性
     */
    private List<SkuPropertyValue> skuPropertyValueList;
}
