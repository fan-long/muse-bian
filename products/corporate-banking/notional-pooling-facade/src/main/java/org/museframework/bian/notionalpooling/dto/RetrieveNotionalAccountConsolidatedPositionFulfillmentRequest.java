package org.museframework.bian.notionalpooling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveNotionalAccountConsolidatedPositionFulfillmentRequest {
    @MetaField
    private String notionalpoolingid;

    @MetaField
    private String notionalaccountconsolidatedpositionfulfillmentid;

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
}