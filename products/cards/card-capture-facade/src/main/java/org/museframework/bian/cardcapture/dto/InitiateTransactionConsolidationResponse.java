package org.museframework.bian.cardcapture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateTransactionConsolidationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardcapture.dto.bq.TransactionConsolidation transactionConsolidation;

    public void setTransactionConsolidation(org.museframework.bian.cardcapture.dto.bq.TransactionConsolidation transactionConsolidation) {
        this.transactionConsolidation = transactionConsolidation;
    }

    public org.museframework.bian.cardcapture.dto.bq.TransactionConsolidation getTransactionConsolidation() {
        return transactionConsolidation;
    }
}