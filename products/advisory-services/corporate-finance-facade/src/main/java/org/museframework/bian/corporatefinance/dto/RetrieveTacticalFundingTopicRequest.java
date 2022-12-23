package org.museframework.bian.corporatefinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTacticalFundingTopicRequest {
    @MetaField
    private String corporatefinanceid;

    @MetaField
    private String tacticalfundingtopicid;

    public void setCorporatefinanceid(String corporatefinanceid) {
        this.corporatefinanceid = corporatefinanceid;
    }

    public String getCorporatefinanceid() {
        return corporatefinanceid;
    }

    public void setTacticalfundingtopicid(String tacticalfundingtopicid) {
        this.tacticalfundingtopicid = tacticalfundingtopicid;
    }

    public String getTacticalfundingtopicid() {
        return tacticalfundingtopicid;
    }
}