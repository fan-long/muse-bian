package org.museframework.bian.bracurdis.dto;

public class ExchangeCashDistributionProcedureRequest {
    private String branchcurrencydistributionid;

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