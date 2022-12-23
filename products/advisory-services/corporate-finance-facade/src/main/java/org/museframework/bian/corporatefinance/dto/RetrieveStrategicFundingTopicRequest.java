package org.museframework.bian.corporatefinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveStrategicFundingTopicRequest {
    @MetaField
    private String corporatefinanceid;

    @MetaField
    private String strategicfundingtopicid;

    public void setCorporatefinanceid(String corporatefinanceid) {
        this.corporatefinanceid = corporatefinanceid;
    }

    public String getCorporatefinanceid() {
        return corporatefinanceid;
    }

    public void setStrategicfundingtopicid(String strategicfundingtopicid) {
        this.strategicfundingtopicid = strategicfundingtopicid;
    }

    public String getStrategicfundingtopicid() {
        return strategicfundingtopicid;
    }
}