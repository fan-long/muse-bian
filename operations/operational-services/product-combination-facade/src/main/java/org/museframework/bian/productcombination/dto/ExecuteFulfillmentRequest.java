package org.museframework.bian.productcombination.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteFulfillmentRequest {
    @MetaField
    private String productcombinationid;

    @MetaField
    private String fulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.productcombination.dto.bq.Fulfillment fulfillment;

    public void setProductcombinationid(String productcombinationid) {
        this.productcombinationid = productcombinationid;
    }

    public String getProductcombinationid() {
        return productcombinationid;
    }

    public void setFulfillmentid(String fulfillmentid) {
        this.fulfillmentid = fulfillmentid;
    }

    public String getFulfillmentid() {
        return fulfillmentid;
    }

    public void setFulfillment(org.museframework.bian.productcombination.dto.bq.Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public org.museframework.bian.productcombination.dto.bq.Fulfillment getFulfillment() {
        return fulfillment;
    }
}