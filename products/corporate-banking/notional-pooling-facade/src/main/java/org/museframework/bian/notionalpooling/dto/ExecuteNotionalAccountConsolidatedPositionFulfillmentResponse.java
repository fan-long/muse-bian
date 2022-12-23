package org.museframework.bian.notionalpooling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteNotionalAccountConsolidatedPositionFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.notionalpooling.dto.bq.NotionalAccountConsolidatedPositionFulfillment notionalAccountConsolidatedPositionFulfillment;

    public void setNotionalAccountConsolidatedPositionFulfillment(org.museframework.bian.notionalpooling.dto.bq.NotionalAccountConsolidatedPositionFulfillment notionalAccountConsolidatedPositionFulfillment) {
        this.notionalAccountConsolidatedPositionFulfillment = notionalAccountConsolidatedPositionFulfillment;
    }

    public org.museframework.bian.notionalpooling.dto.bq.NotionalAccountConsolidatedPositionFulfillment getNotionalAccountConsolidatedPositionFulfillment() {
        return notionalAccountConsolidatedPositionFulfillment;
    }
}