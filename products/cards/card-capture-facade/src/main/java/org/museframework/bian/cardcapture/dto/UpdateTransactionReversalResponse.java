package org.museframework.bian.cardcapture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateTransactionReversalResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardcapture.dto.bq.TransactionReversal transactionReversal;

    public void setTransactionReversal(org.museframework.bian.cardcapture.dto.bq.TransactionReversal transactionReversal) {
        this.transactionReversal = transactionReversal;
    }

    public org.museframework.bian.cardcapture.dto.bq.TransactionReversal getTransactionReversal() {
        return transactionReversal;
    }
}