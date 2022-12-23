package org.museframework.bian.notionalpooling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateNotionalAccountInterestAllocationFulfillmentRequest {
    @MetaField
    private String notionalpoolingid;

    @MetaField
    private String notionalaccountinterestallocationfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.notionalpooling.dto.bq.NotionalAccountInterestAllocationFulfillment notionalAccountInterestAllocationFulfillment;

    public void setNotionalpoolingid(String notionalpoolingid) {
        this.notionalpoolingid = notionalpoolingid;
    }

    public String getNotionalpoolingid() {
        return notionalpoolingid;
    }

    public void setNotionalaccountinterestallocationfulfillmentid(String notionalaccountinterestallocationfulfillmentid) {
        this.notionalaccountinterestallocationfulfillmentid = notionalaccountinterestallocationfulfillmentid;
    }

    public String getNotionalaccountinterestallocationfulfillmentid() {
        return notionalaccountinterestallocationfulfillmentid;
    }

    public void setNotionalAccountInterestAllocationFulfillment(org.museframework.bian.notionalpooling.dto.bq.NotionalAccountInterestAllocationFulfillment notionalAccountInterestAllocationFulfillment) {
        this.notionalAccountInterestAllocationFulfillment = notionalAccountInterestAllocationFulfillment;
    }

    public org.museframework.bian.notionalpooling.dto.bq.NotionalAccountInterestAllocationFulfillment getNotionalAccountInterestAllocationFulfillment() {
        return notionalAccountInterestAllocationFulfillment;
    }
}