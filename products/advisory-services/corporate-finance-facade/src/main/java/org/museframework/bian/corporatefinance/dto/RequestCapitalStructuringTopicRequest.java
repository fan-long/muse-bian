package org.museframework.bian.corporatefinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestCapitalStructuringTopicRequest {
    @MetaField
    private String corporatefinanceid;

    @MetaField
    private String capitalstructuringtopicid;

    @MetaField(ref=true)
    private org.museframework.bian.corporatefinance.dto.bq.CapitalStructuringTopic capitalStructuringTopic;

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

    public void setCapitalStructuringTopic(org.museframework.bian.corporatefinance.dto.bq.CapitalStructuringTopic capitalStructuringTopic) {
        this.capitalStructuringTopic = capitalStructuringTopic;
    }

    public org.museframework.bian.corporatefinance.dto.bq.CapitalStructuringTopic getCapitalStructuringTopic() {
        return capitalStructuringTopic;
    }
}