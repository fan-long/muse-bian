package org.museframework.bian.positionmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateTransactionApplicationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.positionmanagement.dto.bq.TransactionApplication transactionApplication;

    public void setTransactionApplication(org.museframework.bian.positionmanagement.dto.bq.TransactionApplication transactionApplication) {
        this.transactionApplication = transactionApplication;
    }

    public org.museframework.bian.positionmanagement.dto.bq.TransactionApplication getTransactionApplication() {
        return transactionApplication;
    }
}