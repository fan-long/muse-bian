package org.museframework.bian.syndicatedloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeFulfillmentRequest {
    @MetaField
    private String syndicatedloanid;

    @MetaField
    private String fulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.syndicatedloan.dto.bq.Fulfillment fulfillment;

    public void setSyndicatedloanid(String syndicatedloanid) {
        this.syndicatedloanid = syndicatedloanid;
    }

    public String getSyndicatedloanid() {
        return syndicatedloanid;
    }

    public void setFulfillmentid(String fulfillmentid) {
        this.fulfillmentid = fulfillmentid;
    }

    public String getFulfillmentid() {
        return fulfillmentid;
    }

    public void setFulfillment(org.museframework.bian.syndicatedloan.dto.bq.Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public org.museframework.bian.syndicatedloan.dto.bq.Fulfillment getFulfillment() {
        return fulfillment;
    }
}