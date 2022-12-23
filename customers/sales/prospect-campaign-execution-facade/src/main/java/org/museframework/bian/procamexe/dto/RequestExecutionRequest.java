package org.museframework.bian.procamexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestExecutionRequest {
    @MetaField
    private String prospectcampaignexecutionid;

    @MetaField
    private String executionid;

    @MetaField(ref=true)
    private org.museframework.bian.procamexe.dto.bq.Execution execution;

    public void setProspectcampaignexecutionid(String prospectcampaignexecutionid) {
        this.prospectcampaignexecutionid = prospectcampaignexecutionid;
    }

    public String getProspectcampaignexecutionid() {
        return prospectcampaignexecutionid;
    }

    public void setExecutionid(String executionid) {
        this.executionid = executionid;
    }

    public String getExecutionid() {
        return executionid;
    }

    public void setExecution(org.museframework.bian.procamexe.dto.bq.Execution execution) {
        this.execution = execution;
    }

    public org.museframework.bian.procamexe.dto.bq.Execution getExecution() {
        return execution;
    }
}