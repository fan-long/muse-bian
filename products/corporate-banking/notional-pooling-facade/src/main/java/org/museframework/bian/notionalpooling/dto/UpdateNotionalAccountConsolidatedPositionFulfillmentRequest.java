package org.museframework.bian.notionalpooling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateNotionalAccountConsolidatedPositionFulfillmentRequest {
    @MetaField
    private String notionalpoolingid;

    @MetaField
    private String notionalaccountconsolidatedpositionfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.notionalpooling.dto.bq.NotionalAccountConsolidatedPositionFulfillment notionalAccountConsolidatedPositionFulfillment;

    public void setNotionalpoolingid(String notionalpoolingid) {
        this.notionalpoolingid = notionalpoolingid;
    }

    public String getNotionalpoolingid() {
        return notionalpoolingid;
    }

    public void setNotionalaccountconsolidatedpositionfulfillmentid(String notionalaccountconsolidatedpositionfulfillmentid) {
        this.notionalaccountconsolidatedpositionfulfillmentid = notionalaccountconsolidatedpositionfulfillmentid;
    }

    public String getNotionalaccountconsolidatedpositionfulfillmentid() {
        return notionalaccountconsolidatedpositionfulfillmentid;
    }

    public void setNotionalAccountConsolidatedPositionFulfillment(org.museframework.bian.notionalpooling.dto.bq.NotionalAccountConsolidatedPositionFulfillment notionalAccountConsolidatedPositionFulfillment) {
        this.notionalAccountConsolidatedPositionFulfillment = notionalAccountConsolidatedPositionFulfillment;
    }

    public org.museframework.bian.notionalpooling.dto.bq.NotionalAccountConsolidatedPositionFulfillment getNotionalAccountConsolidatedPositionFulfillment() {
        return notionalAccountConsolidatedPositionFulfillment;
    }
}