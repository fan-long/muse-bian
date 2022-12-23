package org.museframework.bian.corporatefinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeTacticalFundingTopicRequest {
    @MetaField
    private String corporatefinanceid;

    @MetaField
    private String tacticalfundingtopicid;

    @MetaField(ref=true)
    private org.museframework.bian.corporatefinance.dto.bq.TacticalFundingTopic tacticalFundingTopic;

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

    public void setTacticalFundingTopic(org.museframework.bian.corporatefinance.dto.bq.TacticalFundingTopic tacticalFundingTopic) {
        this.tacticalFundingTopic = tacticalFundingTopic;
    }

    public org.museframework.bian.corporatefinance.dto.bq.TacticalFundingTopic getTacticalFundingTopic() {
        return tacticalFundingTopic;
    }
}