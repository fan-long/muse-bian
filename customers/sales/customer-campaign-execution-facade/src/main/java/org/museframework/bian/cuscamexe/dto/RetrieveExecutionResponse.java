package org.museframework.bian.cuscamexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveExecutionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cuscamexe.dto.bq.Execution execution;

    public void setExecution(org.museframework.bian.cuscamexe.dto.bq.Execution execution) {
        this.execution = execution;
    }

    public org.museframework.bian.cuscamexe.dto.bq.Execution getExecution() {
        return execution;
    }
}