package org.museframework.bian.achoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOutboundACHRequest {
    @MetaField
    private String achoperationsid;

    @MetaField
    private String outboundachid;

    public void setAchoperationsid(String achoperationsid) {
        this.achoperationsid = achoperationsid;
    }

    public String getAchoperationsid() {
        return achoperationsid;
    }

    public void setOutboundachid(String outboundachid) {
        this.outboundachid = outboundachid;
    }

    public String getOutboundachid() {
        return outboundachid;
    }
}