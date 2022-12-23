package org.museframework.bian.notionalpooling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyNotionalAccountInterestAllocationFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.notionalpooling.dto.bq.NotionalAccountInterestAllocationFulfillment notionalAccountInterestAllocationFulfillment;

    public void setNotionalAccountInterestAllocationFulfillment(org.museframework.bian.notionalpooling.dto.bq.NotionalAccountInterestAllocationFulfillment notionalAccountInterestAllocationFulfillment) {
        this.notionalAccountInterestAllocationFulfillment = notionalAccountInterestAllocationFulfillment;
    }

    public org.museframework.bian.notionalpooling.dto.bq.NotionalAccountInterestAllocationFulfillment getNotionalAccountInterestAllocationFulfillment() {
        return notionalAccountInterestAllocationFulfillment;
    }
}