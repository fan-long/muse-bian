package org.museframework.bian.commissions.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCommissionTransactionRequest {
    @MetaField
    private String commissionsid;

    @MetaField(ref=true)
    private org.museframework.bian.commissions.dto.cr.CommissionTransaction commissionTransaction;

    public void setCommissionsid(String commissionsid) {
        this.commissionsid = commissionsid;
    }

    public String getCommissionsid() {
        return commissionsid;
    }

    public void setCommissionTransaction(org.museframework.bian.commissions.dto.cr.CommissionTransaction commissionTransaction) {
        this.commissionTransaction = commissionTransaction;
    }

    public org.museframework.bian.commissions.dto.cr.CommissionTransaction getCommissionTransaction() {
        return commissionTransaction;
    }
}