package org.museframework.bian.accountsreceivable.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveReceivablesEvaluationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.accountsreceivable.dto.bq.ReceivablesEvaluation receivablesEvaluation;

    public void setReceivablesEvaluation(org.museframework.bian.accountsreceivable.dto.bq.ReceivablesEvaluation receivablesEvaluation) {
        this.receivablesEvaluation = receivablesEvaluation;
    }

    public org.museframework.bian.accountsreceivable.dto.bq.ReceivablesEvaluation getReceivablesEvaluation() {
        return receivablesEvaluation;
    }
}