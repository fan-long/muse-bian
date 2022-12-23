package org.museframework.bian.bankguarantee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveBankGuaranteeIssuanceandBookingTaskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeIssuanceandBookingTask bankGuaranteeIssuanceandBookingTask;

    public void setBankGuaranteeIssuanceandBookingTask(org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeIssuanceandBookingTask bankGuaranteeIssuanceandBookingTask) {
        this.bankGuaranteeIssuanceandBookingTask = bankGuaranteeIssuanceandBookingTask;
    }

    public org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeIssuanceandBookingTask getBankGuaranteeIssuanceandBookingTask() {
        return bankGuaranteeIssuanceandBookingTask;
    }
}