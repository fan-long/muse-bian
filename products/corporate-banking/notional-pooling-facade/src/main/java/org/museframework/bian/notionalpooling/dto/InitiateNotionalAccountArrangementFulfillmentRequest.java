package org.museframework.bian.notionalpooling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateNotionalAccountArrangementFulfillmentRequest {
    @MetaField
    private String notionalpoolingid;

    @MetaField
    private String notionalaccountarrangementfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.notionalpooling.dto.bq.NotionalAccountArrangementFulfillment notionalAccountArrangementFulfillment;

    public void setNotionalpoolingid(String notionalpoolingid) {
        this.notionalpoolingid = notionalpoolingid;
    }

    public String getNotionalpoolingid() {
        return notionalpoolingid;
    }

    public void setNotionalaccountarrangementfulfillmentid(String notionalaccountarrangementfulfillmentid) {
        this.notionalaccountarrangementfulfillmentid = notionalaccountarrangementfulfillmentid;
    }

    public String getNotionalaccountarrangementfulfillmentid() {
        return notionalaccountarrangementfulfillmentid;
    }

    public void setNotionalAccountArrangementFulfillment(org.museframework.bian.notionalpooling.dto.bq.NotionalAccountArrangementFulfillment notionalAccountArrangementFulfillment) {
        this.notionalAccountArrangementFulfillment = notionalAccountArrangementFulfillment;
    }

    public org.museframework.bian.notionalpooling.dto.bq.NotionalAccountArrangementFulfillment getNotionalAccountArrangementFulfillment() {
        return notionalAccountArrangementFulfillment;
    }
}