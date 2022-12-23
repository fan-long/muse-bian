package org.museframework.bian.cardcapture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveTransactionCaptureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardcapture.dto.bq.TransactionCapture transactionCapture;

    public void setTransactionCapture(org.museframework.bian.cardcapture.dto.bq.TransactionCapture transactionCapture) {
        this.transactionCapture = transactionCapture;
    }

    public org.museframework.bian.cardcapture.dto.bq.TransactionCapture getTransactionCapture() {
        return transactionCapture;
    }
}