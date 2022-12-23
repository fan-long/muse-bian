package org.museframework.bian.traconmat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteTransactionReportingFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.traconmat.dto.bq.TransactionReportingFunction transactionReportingFunction;

    public void setTransactionReportingFunction(org.museframework.bian.traconmat.dto.bq.TransactionReportingFunction transactionReportingFunction) {
        this.transactionReportingFunction = transactionReportingFunction;
    }

    public org.museframework.bian.traconmat.dto.bq.TransactionReportingFunction getTransactionReportingFunction() {
        return transactionReportingFunction;
    }
}