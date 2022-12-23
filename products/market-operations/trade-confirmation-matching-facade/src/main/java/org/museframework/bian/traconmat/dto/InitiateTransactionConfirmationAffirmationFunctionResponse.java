package org.museframework.bian.traconmat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateTransactionConfirmationAffirmationFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.traconmat.dto.bq.TransactionConfirmationAffirmationFunction transactionConfirmationAffirmationFunction;

    public void setTransactionConfirmationAffirmationFunction(org.museframework.bian.traconmat.dto.bq.TransactionConfirmationAffirmationFunction transactionConfirmationAffirmationFunction) {
        this.transactionConfirmationAffirmationFunction = transactionConfirmationAffirmationFunction;
    }

    public org.museframework.bian.traconmat.dto.bq.TransactionConfirmationAffirmationFunction getTransactionConfirmationAffirmationFunction() {
        return transactionConfirmationAffirmationFunction;
    }
}