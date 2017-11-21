package com.timma.work.model.goods;

import java.io.Serializable;

/**
 * @Description:
 *
 * @Author: hzwangzhichao1@corp.netease.com
 * @Date: 2017/11/20
 */
public class SkuPropertyValue implements Serializable {

    private static final long serialVersionUID = -429166940931690613L;

    private String propertyNameId;

    /**
     * 销售属性项名
     */
    private String propertyName ;


    private String propertyValueId;// 属性值ID

    private String propertyValue = "";// 属性值


    public String getPropertyNameId() {
        return propertyNameId;
    }

    public void setPropertyNameId(String propertyNameId) {
        this.propertyNameId = propertyNameId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }


    public String getPropertyValueId() {
        return propertyValueId;
    }

    public void setPropertyValueId(String propertyValueId) {
        this.propertyValueId = propertyValueId;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    @Override
    public int hashCode() {
        return getPropertyValueId().hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        if(obj!=null && obj instanceof SkuPropertyValue){
            SkuPropertyValue skuPropertyValue = (SkuPropertyValue)obj;
            return skuPropertyValue.getPropertyValueId().equals(getPropertyValueId());
        }
        return false;

    }

}