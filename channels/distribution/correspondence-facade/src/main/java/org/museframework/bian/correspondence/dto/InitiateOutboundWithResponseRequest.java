package org.museframework.bian.correspondence.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateOutboundWithResponseRequest {
    @MetaField
    private String correspondenceid;

    @MetaField
    private String outboundwithresponseid;

    @MetaField(ref=true)
    private org.museframework.bian.correspondence.dto.bq.OutboundWithResponse outboundWithResponse;

    public void setCorrespondenceid(String correspondenceid) {
        this.correspondenceid = correspondenceid;
    }

    public String getCorrespondenceid() {
        return correspondenceid;
    }

    public void setOutboundwithresponseid(String outboundwithresponseid) {
        this.outboundwithresponseid = outboundwithresponseid;
    }

    public String getOutboundwithresponseid() {
        return outboundwithresponseid;
    }

    public void setOutboundWithResponse(org.museframework.bian.correspondence.dto.bq.OutboundWithResponse outboundWithResponse) {
        this.outboundWithResponse = outboundWithResponse;
    }

    public org.museframework.bian.correspondence.dto.bq.OutboundWithResponse getOutboundWithResponse() {
        return outboundWithResponse;
    }
}