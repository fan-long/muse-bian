package org.museframework.bian.commissions.dto;

public class UpdateCommissionTransactionRequest {
    private String commissionsid;

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