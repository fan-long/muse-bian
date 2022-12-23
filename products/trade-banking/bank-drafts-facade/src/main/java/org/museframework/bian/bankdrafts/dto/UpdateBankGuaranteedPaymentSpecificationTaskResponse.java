package org.museframework.bian.bankdrafts.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateBankGuaranteedPaymentSpecificationTaskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentSpecificationTask bankGuaranteedPaymentSpecificationTask;

    public void setBankGuaranteedPaymentSpecificationTask(org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentSpecificationTask bankGuaranteedPaymentSpecificationTask) {
        this.bankGuaranteedPaymentSpecificationTask = bankGuaranteedPaymentSpecificationTask;
    }

    public org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentSpecificationTask getBankGuaranteedPaymentSpecificationTask() {
        return bankGuaranteedPaymentSpecificationTask;
    }
}