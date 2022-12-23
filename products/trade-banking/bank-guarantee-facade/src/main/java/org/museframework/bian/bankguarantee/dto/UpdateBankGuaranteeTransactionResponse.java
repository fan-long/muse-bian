package org.museframework.bian.bankguarantee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateBankGuaranteeTransactionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.bankguarantee.dto.cr.BankGuaranteeTransaction bankGuaranteeTransaction;

    public void setBankGuaranteeTransaction(org.museframework.bian.bankguarantee.dto.cr.BankGuaranteeTransaction bankGuaranteeTransaction) {
        this.bankGuaranteeTransaction = bankGuaranteeTransaction;
    }

    public org.museframework.bian.bankguarantee.dto.cr.BankGuaranteeTransaction getBankGuaranteeTransaction() {
        return bankGuaranteeTransaction;
    }
}