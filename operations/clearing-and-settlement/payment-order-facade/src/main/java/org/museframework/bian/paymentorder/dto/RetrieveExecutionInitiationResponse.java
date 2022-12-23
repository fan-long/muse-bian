package org.museframework.bian.paymentorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveExecutionInitiationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.paymentorder.dto.bq.ExecutionInitiation executionInitiation;

    public void setExecutionInitiation(org.museframework.bian.paymentorder.dto.bq.ExecutionInitiation executionInitiation) {
        this.executionInitiation = executionInitiation;
    }

    public org.museframework.bian.paymentorder.dto.bq.ExecutionInitiation getExecutionInitiation() {
        return executionInitiation;
    }
}