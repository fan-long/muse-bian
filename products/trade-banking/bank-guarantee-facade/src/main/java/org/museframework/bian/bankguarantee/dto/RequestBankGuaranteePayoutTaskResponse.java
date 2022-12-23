package org.museframework.bian.bankguarantee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestBankGuaranteePayoutTaskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.bankguarantee.dto.bq.BankGuaranteePayoutTask bankGuaranteePayoutTask;

    public void setBankGuaranteePayoutTask(org.museframework.bian.bankguarantee.dto.bq.BankGuaranteePayoutTask bankGuaranteePayoutTask) {
        this.bankGuaranteePayoutTask = bankGuaranteePayoutTask;
    }

    public org.museframework.bian.bankguarantee.dto.bq.BankGuaranteePayoutTask getBankGuaranteePayoutTask() {
        return bankGuaranteePayoutTask;
    }
}