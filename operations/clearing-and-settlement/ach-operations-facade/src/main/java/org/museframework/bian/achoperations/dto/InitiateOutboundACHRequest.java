package org.museframework.bian.achoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateOutboundACHRequest {
    @MetaField
    private String achoperationsid;

    @MetaField
    private String outboundachid;

    @MetaField(ref=true)
    private org.museframework.bian.achoperations.dto.bq.OutboundACH outboundACH;

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

    public void setOutboundACH(org.museframework.bian.achoperations.dto.bq.OutboundACH outboundACH) {
        this.outboundACH = outboundACH;
    }

    public org.museframework.bian.achoperations.dto.bq.OutboundACH getOutboundACH() {
        return outboundACH;
    }
}