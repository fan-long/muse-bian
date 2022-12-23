package org.museframework.bian.commissions.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestCommissionTransactionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.commissions.dto.cr.CommissionTransaction commissionTransaction;

    public void setCommissionTransaction(org.museframework.bian.commissions.dto.cr.CommissionTransaction commissionTransaction) {
        this.commissionTransaction = commissionTransaction;
    }

    public org.museframework.bian.commissions.dto.cr.CommissionTransaction getCommissionTransaction() {
        return commissionTransaction;
    }
}