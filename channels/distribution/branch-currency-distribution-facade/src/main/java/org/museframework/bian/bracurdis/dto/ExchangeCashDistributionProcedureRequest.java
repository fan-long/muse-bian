package org.museframework.bian.bracurdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeCashDistributionProcedureRequest {
    @MetaField
    private String branchcurrencydistributionid;

    @MetaField(ref=true)
    private org.museframework.bian.bracurdis.dto.cr.CashDistributionProcedure cashDistributionProcedure;

    public void setBranchcurrencydistributionid(String branchcurrencydistributionid) {
        this.branchcurrencydistributionid = branchcurrencydistributionid;
    }

    public String getBranchcurrencydistributionid() {
        return branchcurrencydistributionid;
    }

    public void setCashDistributionProcedure(org.museframework.bian.bracurdis.dto.cr.CashDistributionProcedure cashDistributionProcedure) {
        this.cashDistributionProcedure = cashDistributionProcedure;
    }

    public org.museframework.bian.bracurdis.dto.cr.CashDistributionProcedure getCashDistributionProcedure() {
        return cashDistributionProcedure;
    }
}