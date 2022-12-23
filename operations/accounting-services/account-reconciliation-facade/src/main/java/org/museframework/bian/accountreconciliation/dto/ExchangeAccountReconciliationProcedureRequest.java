package org.museframework.bian.accountreconciliation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeAccountReconciliationProcedureRequest {
    @MetaField
    private String accountreconciliationid;

    @MetaField(ref=true)
    private org.museframework.bian.accountreconciliation.dto.cr.AccountReconciliationProcedure accountReconciliationProcedure;

    public void setAccountreconciliationid(String accountreconciliationid) {
        this.accountreconciliationid = accountreconciliationid;
    }

    public String getAccountreconciliationid() {
        return accountreconciliationid;
    }

    public void setAccountReconciliationProcedure(org.museframework.bian.accountreconciliation.dto.cr.AccountReconciliationProcedure accountReconciliationProcedure) {
        this.accountReconciliationProcedure = accountReconciliationProcedure;
    }

    public org.museframework.bian.accountreconciliation.dto.cr.AccountReconciliationProcedure getAccountReconciliationProcedure() {
        return accountReconciliationProcedure;
    }
}