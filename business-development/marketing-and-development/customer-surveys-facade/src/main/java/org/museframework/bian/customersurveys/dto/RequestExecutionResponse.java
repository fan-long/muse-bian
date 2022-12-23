package org.museframework.bian.customersurveys.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestExecutionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customersurveys.dto.bq.Execution execution;

    public void setExecution(org.museframework.bian.customersurveys.dto.bq.Execution execution) {
        this.execution = execution;
    }

    public org.museframework.bian.customersurveys.dto.bq.Execution getExecution() {
        return execution;
    }
}