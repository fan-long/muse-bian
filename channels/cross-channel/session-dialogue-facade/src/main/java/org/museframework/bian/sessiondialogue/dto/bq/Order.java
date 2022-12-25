/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.sessiondialogue.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Order {
    /*Reference to a specific type of customer order (e.g. consolidated balance, change of address, simple product/service guidance)*/
    @MetaField(0)
    private String orderType;

    /*The type of case being processed including any supporting narrative (e.g. disputed charges, suspected account fraud, stolen device, change of status)*/
    @MetaField(0)
    private String orderTaskRecord;

    /*Forms and actions agreed and registered during the order*/
    @MetaField(0)
    private String orderTaskWorkProducts;

    /*The result of the order task (e.g. order completed, actions pending)*/
    @MetaField(0)
    private String orderTaskWorkResult;

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderTaskRecord(String orderTaskRecord) {
        this.orderTaskRecord = orderTaskRecord;
    }

    public String getOrderTaskRecord() {
        return orderTaskRecord;
    }

    public void setOrderTaskWorkProducts(String orderTaskWorkProducts) {
        this.orderTaskWorkProducts = orderTaskWorkProducts;
    }

    public String getOrderTaskWorkProducts() {
        return orderTaskWorkProducts;
    }

    public void setOrderTaskWorkResult(String orderTaskWorkResult) {
        this.orderTaskWorkResult = orderTaskWorkResult;
    }

    public String getOrderTaskWorkResult() {
        return orderTaskWorkResult;
    }
}