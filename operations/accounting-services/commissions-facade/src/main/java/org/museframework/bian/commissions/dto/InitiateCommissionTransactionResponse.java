package org.museframework.bian.commissions.dto;

public class InitiateCommissionTransactionResponse {
    private org.museframework.bian.commissions.dto.cr.CommissionTransaction commissionTransaction;

    public void setCommissionTransaction(org.museframework.bian.commissions.dto.cr.CommissionTransaction commissionTransaction) {
        this.commissionTransaction = commissionTransaction;
    }

    public org.museframework.bian.commissions.dto.cr.CommissionTransaction getCommissionTransaction() {
        return commissionTransaction;
    }
}