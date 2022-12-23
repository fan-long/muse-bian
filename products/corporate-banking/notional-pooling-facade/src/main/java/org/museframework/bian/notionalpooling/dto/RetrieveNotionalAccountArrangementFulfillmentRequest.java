package org.museframework.bian.notionalpooling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveNotionalAccountArrangementFulfillmentRequest {
    @MetaField
    private String notionalpoolingid;

    @MetaField
    private String notionalaccountarrangementfulfillmentid;

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
}