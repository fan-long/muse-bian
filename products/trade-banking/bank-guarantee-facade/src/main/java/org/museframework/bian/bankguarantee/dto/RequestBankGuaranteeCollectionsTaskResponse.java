package org.museframework.bian.bankguarantee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestBankGuaranteeCollectionsTaskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeCollectionsTask bankGuaranteeCollectionsTask;

    public void setBankGuaranteeCollectionsTask(org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeCollectionsTask bankGuaranteeCollectionsTask) {
        this.bankGuaranteeCollectionsTask = bankGuaranteeCollectionsTask;
    }

    public org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeCollectionsTask getBankGuaranteeCollectionsTask() {
        return bankGuaranteeCollectionsTask;
    }
}