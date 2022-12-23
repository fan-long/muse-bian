package org.museframework.bian.producttraining.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeServiceEvaluationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.producttraining.dto.bq.ServiceEvaluation serviceEvaluation;

    public void setServiceEvaluation(org.museframework.bian.producttraining.dto.bq.ServiceEvaluation serviceEvaluation) {
        this.serviceEvaluation = serviceEvaluation;
    }

    public org.museframework.bian.producttraining.dto.bq.ServiceEvaluation getServiceEvaluation() {
        return serviceEvaluation;
    }
}