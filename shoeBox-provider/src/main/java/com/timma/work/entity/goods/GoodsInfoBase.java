package com.timma.work.entity.goods;

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
}
