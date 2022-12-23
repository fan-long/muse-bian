package org.museframework.bian.cardcapture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateTransactionAuthorizationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardcapture.dto.bq.TransactionAuthorization transactionAuthorization;

    public void setTransactionAuthorization(org.museframework.bian.cardcapture.dto.bq.TransactionAuthorization transactionAuthorization) {
        this.transactionAuthorization = transactionAuthorization;
    }

    public org.museframework.bian.cardcapture.dto.bq.TransactionAuthorization getTransactionAuthorization() {
        return transactionAuthorization;
    }
}