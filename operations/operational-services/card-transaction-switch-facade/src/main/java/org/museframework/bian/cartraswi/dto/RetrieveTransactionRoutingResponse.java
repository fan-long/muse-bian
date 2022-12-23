package org.museframework.bian.cartraswi.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveTransactionRoutingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cartraswi.dto.bq.TransactionRouting transactionRouting;

    public void setTransactionRouting(org.museframework.bian.cartraswi.dto.bq.TransactionRouting transactionRouting) {
        this.transactionRouting = transactionRouting;
    }

    public org.museframework.bian.cartraswi.dto.bq.TransactionRouting getTransactionRouting() {
        return transactionRouting;
    }
}