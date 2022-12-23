package org.museframework.bian.achoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInboundACHRequest {
    @MetaField
    private String achoperationsid;

    @MetaField
    private String inboundachid;

    @MetaField(ref=true)
    private org.museframework.bian.achoperations.dto.bq.InboundACH inboundACH;

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

    public void setInboundACH(org.museframework.bian.achoperations.dto.bq.InboundACH inboundACH) {
        this.inboundACH = inboundACH;
    }

    public org.museframework.bian.achoperations.dto.bq.InboundACH getInboundACH() {
        return inboundACH;
    }
}