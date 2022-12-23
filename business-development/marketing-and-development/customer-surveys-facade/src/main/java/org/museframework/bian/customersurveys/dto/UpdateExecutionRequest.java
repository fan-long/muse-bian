package org.museframework.bian.customersurveys.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateExecutionRequest {
    @MetaField
    private String customersurveysid;

    @MetaField
    private String executionid;

    @MetaField(ref=true)
    private org.museframework.bian.customersurveys.dto.bq.Execution execution;

    public void setCustomersurveysid(String customersurveysid) {
        this.customersurveysid = customersurveysid;
    }

    public String getCustomersurveysid() {
        return customersurveysid;
    }

    public void setExecutionid(String executionid) {
        this.executionid = executionid;
    }

    public String getExecutionid() {
        return executionid;
    }

    public void setExecution(org.museframework.bian.customersurveys.dto.bq.Execution execution) {
        this.execution = execution;
    }

    public org.museframework.bian.customersurveys.dto.bq.Execution getExecution() {
        return execution;
    }
}