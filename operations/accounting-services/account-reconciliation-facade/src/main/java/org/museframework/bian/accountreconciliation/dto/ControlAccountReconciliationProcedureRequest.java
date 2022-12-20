package org.museframework.bian.accountreconciliation.dto;

public class ControlAccountReconciliationProcedureRequest {
    private String accountreconciliationid;

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