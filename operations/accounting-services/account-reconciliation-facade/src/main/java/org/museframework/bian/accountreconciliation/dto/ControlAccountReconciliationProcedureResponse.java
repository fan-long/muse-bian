package org.museframework.bian.accountreconciliation.dto;

public class ControlAccountReconciliationProcedureResponse {
    private org.museframework.bian.accountreconciliation.dto.cr.AccountReconciliationProcedure accountReconciliationProcedure;

    public void setAccountReconciliationProcedure(org.museframework.bian.accountreconciliation.dto.cr.AccountReconciliationProcedure accountReconciliationProcedure) {
        this.accountReconciliationProcedure = accountReconciliationProcedure;
    }

    public org.museframework.bian.accountreconciliation.dto.cr.AccountReconciliationProcedure getAccountReconciliationProcedure() {
        return accountReconciliationProcedure;
    }
}