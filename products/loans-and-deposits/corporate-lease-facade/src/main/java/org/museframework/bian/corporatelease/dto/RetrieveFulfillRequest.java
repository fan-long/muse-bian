package org.museframework.bian.corporatelease.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFulfillRequest {
    @MetaField
    private String corporateleaseid;

    @MetaField
    private String fulfillid;

    public void setCorporateleaseid(String corporateleaseid) {
        this.corporateleaseid = corporateleaseid;
    }

    public String getCorporateleaseid() {
        return corporateleaseid;
    }

    public void setFulfillid(String fulfillid) {
        this.fulfillid = fulfillid;
    }

    public String getFulfillid() {
        return fulfillid;
    }
}