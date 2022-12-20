package org.museframework.bian.bracurdis.dto;

public class InitiateCashDistributionProcedureResponse {
    private org.museframework.bian.bracurdis.dto.cr.CashDistributionProcedure cashDistributionProcedure;

    public void setCashDistributionProcedure(org.museframework.bian.bracurdis.dto.cr.CashDistributionProcedure cashDistributionProcedure) {
        this.cashDistributionProcedure = cashDistributionProcedure;
    }

    public org.museframework.bian.bracurdis.dto.cr.CashDistributionProcedure getCashDistributionProcedure() {
        return cashDistributionProcedure;
    }
}