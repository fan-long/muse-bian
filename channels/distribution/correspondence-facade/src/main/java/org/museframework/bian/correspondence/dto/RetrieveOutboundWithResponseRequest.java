package org.museframework.bian.correspondence.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOutboundWithResponseRequest {
    @MetaField
    private String correspondenceid;

    @MetaField
    private String outboundwithresponseid;

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
}