package org.museframework.bian.chelocbox.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangePaperCheckProcessingFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.chelocbox.dto.bq.PaperCheckProcessingFulfillment paperCheckProcessingFulfillment;

    public void setPaperCheckProcessingFulfillment(org.museframework.bian.chelocbox.dto.bq.PaperCheckProcessingFulfillment paperCheckProcessingFulfillment) {
        this.paperCheckProcessingFulfillment = paperCheckProcessingFulfillment;
    }

    public org.museframework.bian.chelocbox.dto.bq.PaperCheckProcessingFulfillment getPaperCheckProcessingFulfillment() {
        return paperCheckProcessingFulfillment;
    }
}