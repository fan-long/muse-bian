package org.museframework.bian.accountrecovery.dto;

public class UpdateAccountRecoveryProcedureRequest {
    private String accountrecoveryid;

    private org.museframework.bian.accountrecovery.dto.cr.AccountRecoveryProcedure accountRecoveryProcedure;

    public void setAccountrecoveryid(String accountrecoveryid) {
        this.accountrecoveryid = accountrecoveryid;
    }

    public String getAccountrecoveryid() {
        return accountrecoveryid;
    }

    public void setAccountRecoveryProcedure(org.museframework.bian.accountrecovery.dto.cr.AccountRecoveryProcedure accountRecoveryProcedure) {
        this.accountRecoveryProcedure = accountRecoveryProcedure;
    }

    public org.museframework.bian.accountrecovery.dto.cr.AccountRecoveryProcedure getAccountRecoveryProcedure() {
        return accountRecoveryProcedure;
    }
}