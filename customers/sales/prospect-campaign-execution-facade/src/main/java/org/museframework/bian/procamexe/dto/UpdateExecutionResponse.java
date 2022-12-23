package org.museframework.bian.procamexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateExecutionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.procamexe.dto.bq.Execution execution;

    public void setExecution(org.museframework.bian.procamexe.dto.bq.Execution execution) {
        this.execution = execution;
    }

    public org.museframework.bian.procamexe.dto.bq.Execution getExecution() {
        return execution;
    }
}