package org.museframework.bian.fiduciaryagreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFulfillmentRequest {
    @MetaField
    private String fiduciaryagreementid;

    @MetaField
    private String fulfillmentid;

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
}