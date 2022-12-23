package org.museframework.bian.carecogat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateTransactionBatchResponse {
    @MetaField(ref=true)
    private org.museframework.bian.carecogat.dto.bq.TransactionBatch transactionBatch;

    public void setTransactionBatch(org.museframework.bian.carecogat.dto.bq.TransactionBatch transactionBatch) {
        this.transactionBatch = transactionBatch;
    }

    public org.museframework.bian.carecogat.dto.bq.TransactionBatch getTransactionBatch() {
        return transactionBatch;
    }
}