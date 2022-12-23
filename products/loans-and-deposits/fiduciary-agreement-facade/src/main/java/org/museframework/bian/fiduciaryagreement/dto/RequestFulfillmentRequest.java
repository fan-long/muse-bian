package org.museframework.bian.fiduciaryagreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestFulfillmentRequest {
    @MetaField
    private String fiduciaryagreementid;

    @MetaField
    private String fulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.fiduciaryagreement.dto.bq.Fulfillment fulfillment;

    public void setFiduciaryagreementid(String fiduciaryagreementid) {
        this.fiduciaryagreementid = fiduciaryagreementid;
    }

    public String getFiduciaryagreementid() {
        return fiduciaryagreementid;
    }

    public void setFulfillmentid(String fulfillmentid) {
        this.fulfillmentid = fulfillmentid;
    }

    public String getFulfillmentid() {
        return fulfillmentid;
    }

    public void setFulfillment(org.museframework.bian.fiduciaryagreement.dto.bq.Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public org.museframework.bian.fiduciaryagreement.dto.bq.Fulfillment getFulfillment() {
        return fulfillment;
    }
}