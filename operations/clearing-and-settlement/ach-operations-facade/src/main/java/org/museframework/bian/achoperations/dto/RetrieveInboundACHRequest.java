package org.museframework.bian.achoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInboundACHRequest {
    @MetaField
    private String achoperationsid;

    @MetaField
    private String inboundachid;

    public void setAchoperationsid(String achoperationsid) {
        this.achoperationsid = achoperationsid;
    }

    public String getAchoperationsid() {
        return achoperationsid;
    }

    public void setInboundachid(String inboundachid) {
        this.inboundachid = inboundachid;
    }

    public String getInboundachid() {
        return inboundachid;
    }
}