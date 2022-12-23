package org.museframework.bian.corporatefinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateStrategicFundingTopicRequest {
    @MetaField
    private String corporatefinanceid;

    @MetaField
    private String strategicfundingtopicid;

    @MetaField(ref=true)
    private org.museframework.bian.corporatefinance.dto.bq.StrategicFundingTopic strategicFundingTopic;

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

    public void setStrategicFundingTopic(org.museframework.bian.corporatefinance.dto.bq.StrategicFundingTopic strategicFundingTopic) {
        this.strategicFundingTopic = strategicFundingTopic;
    }

    public org.museframework.bian.corporatefinance.dto.bq.StrategicFundingTopic getStrategicFundingTopic() {
        return strategicFundingTopic;
    }
}