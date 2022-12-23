package org.museframework.bian.bankdrafts.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestBankGuaranteedPaymentRemittanceTaskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentRemittanceTask bankGuaranteedPaymentRemittanceTask;

    public void setBankGuaranteedPaymentRemittanceTask(org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentRemittanceTask bankGuaranteedPaymentRemittanceTask) {
        this.bankGuaranteedPaymentRemittanceTask = bankGuaranteedPaymentRemittanceTask;
    }

    public org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentRemittanceTask getBankGuaranteedPaymentRemittanceTask() {
        return bankGuaranteedPaymentRemittanceTask;
    }
}