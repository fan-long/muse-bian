package org.museframework.bian.positionmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateTrialTransactionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.positionmanagement.dto.bq.TrialTransaction trialTransaction;

    public void setTrialTransaction(org.museframework.bian.positionmanagement.dto.bq.TrialTransaction trialTransaction) {
        this.trialTransaction = trialTransaction;
    }

    public org.museframework.bian.positionmanagement.dto.bq.TrialTransaction getTrialTransaction() {
        return trialTransaction;
    }
}