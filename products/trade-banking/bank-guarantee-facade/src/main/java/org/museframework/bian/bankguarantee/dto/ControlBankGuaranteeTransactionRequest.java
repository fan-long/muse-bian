package org.museframework.bian.bankguarantee.dto;

public class ControlBankGuaranteeTransactionRequest {
    private String bankguaranteeid;

    private org.museframework.bian.bankguarantee.dto.cr.BankGuaranteeTransaction bankGuaranteeTransaction;

    public void setBankguaranteeid(String bankguaranteeid) {
        this.bankguaranteeid = bankguaranteeid;
    }

    public String getBankguaranteeid() {
        return bankguaranteeid;
    }

    public void setBankGuaranteeTransaction(org.museframework.bian.bankguarantee.dto.cr.BankGuaranteeTransaction bankGuaranteeTransaction) {
        this.bankGuaranteeTransaction = bankGuaranteeTransaction;
    }

    public org.museframework.bian.bankguarantee.dto.cr.BankGuaranteeTransaction getBankGuaranteeTransaction() {
        return bankGuaranteeTransaction;
    }
}