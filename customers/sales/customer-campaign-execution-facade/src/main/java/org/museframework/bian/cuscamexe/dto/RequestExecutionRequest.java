package org.museframework.bian.cuscamexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestExecutionRequest {
    @MetaField
    private String customercampaignexecutionid;

    @MetaField
    private String executionid;

    @MetaField(ref=true)
    private org.museframework.bian.cuscamexe.dto.bq.Execution execution;

    public void setCustomercampaignexecutionid(String customercampaignexecutionid) {
        this.customercampaignexecutionid = customercampaignexecutionid;
    }

    public String getCustomercampaignexecutionid() {
        return customercampaignexecutionid;
    }

    public void setExecutionid(String executionid) {
        this.executionid = executionid;
    }

    public String getExecutionid() {
        return executionid;
    }

    public void setExecution(org.museframework.bian.cuscamexe.dto.bq.Execution execution) {
        this.execution = execution;
    }

    public org.museframework.bian.cuscamexe.dto.bq.Execution getExecution() {
        return execution;
    }
}