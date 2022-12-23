package org.museframework.bian.accountreconciliation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAccountReconciliationProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.accountreconciliation.dto.cr.AccountReconciliationProcedure accountReconciliationProcedure;

    public void setAccountReconciliationProcedure(org.museframework.bian.accountreconciliation.dto.cr.AccountReconciliationProcedure accountReconciliationProcedure) {
        this.accountReconciliationProcedure = accountReconciliationProcedure;
    }

    public org.museframework.bian.accountreconciliation.dto.cr.AccountReconciliationProcedure getAccountReconciliationProcedure() {
        return accountReconciliationProcedure;
    }
}