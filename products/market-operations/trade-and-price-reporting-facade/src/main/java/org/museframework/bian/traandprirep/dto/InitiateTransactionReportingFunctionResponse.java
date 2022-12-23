package org.museframework.bian.traandprirep.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateTransactionReportingFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.traandprirep.dto.bq.TransactionReportingFunction transactionReportingFunction;

    public void setTransactionReportingFunction(org.museframework.bian.traandprirep.dto.bq.TransactionReportingFunction transactionReportingFunction) {
        this.transactionReportingFunction = transactionReportingFunction;
    }

    public org.museframework.bian.traandprirep.dto.bq.TransactionReportingFunction getTransactionReportingFunction() {
        return transactionReportingFunction;
    }
}