package org.museframework.bian.corporatefinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCapitalStructuringTopicRequest {
    @MetaField
    private String corporatefinanceid;

    @MetaField
    private String capitalstructuringtopicid;

    public void setCorporatefinanceid(String corporatefinanceid) {
        this.corporatefinanceid = corporatefinanceid;
    }

    public String getCorporatefinanceid() {
        return corporatefinanceid;
    }

    public void setCapitalstructuringtopicid(String capitalstructuringtopicid) {
        this.capitalstructuringtopicid = capitalstructuringtopicid;
    }

    public String getCapitalstructuringtopicid() {
        return capitalstructuringtopicid;
    }
}