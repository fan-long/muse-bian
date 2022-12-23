package org.museframework.bian.notionalpooling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestNotionalAccountArrangementFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.notionalpooling.dto.bq.NotionalAccountArrangementFulfillment notionalAccountArrangementFulfillment;

    public void setNotionalAccountArrangementFulfillment(org.museframework.bian.notionalpooling.dto.bq.NotionalAccountArrangementFulfillment notionalAccountArrangementFulfillment) {
        this.notionalAccountArrangementFulfillment = notionalAccountArrangementFulfillment;
    }

    public org.museframework.bian.notionalpooling.dto.bq.NotionalAccountArrangementFulfillment getNotionalAccountArrangementFulfillment() {
        return notionalAccountArrangementFulfillment;
    }
}