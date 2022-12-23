package org.museframework.bian.notionalpooling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyNotionalAccountInterestAllocationFulfillmentRequest {
    @MetaField
    private String notionalpoolingid;

    @MetaField
    private String notionalaccountinterestallocationfulfillmentid;

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
}