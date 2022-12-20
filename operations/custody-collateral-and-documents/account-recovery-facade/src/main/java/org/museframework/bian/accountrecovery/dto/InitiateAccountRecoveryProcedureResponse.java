package org.museframework.bian.accountrecovery.dto;

public class InitiateAccountRecoveryProcedureResponse {
    private org.museframework.bian.accountrecovery.dto.cr.AccountRecoveryProcedure accountRecoveryProcedure;

    public void setAccountRecoveryProcedure(org.museframework.bian.accountrecovery.dto.cr.AccountRecoveryProcedure accountRecoveryProcedure) {
        this.accountRecoveryProcedure = accountRecoveryProcedure;
    }

    public org.museframework.bian.accountrecovery.dto.cr.AccountRecoveryProcedure getAccountRecoveryProcedure() {
        return accountRecoveryProcedure;
    }
}