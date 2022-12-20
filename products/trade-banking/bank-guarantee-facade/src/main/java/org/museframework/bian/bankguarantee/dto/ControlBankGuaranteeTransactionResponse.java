package org.museframework.bian.bankguarantee.dto;

public class ControlBankGuaranteeTransactionResponse {
    private org.museframework.bian.bankguarantee.dto.cr.BankGuaranteeTransaction bankGuaranteeTransaction;

    public void setBankGuaranteeTransaction(org.museframework.bian.bankguarantee.dto.cr.BankGuaranteeTransaction bankGuaranteeTransaction) {
        this.bankGuaranteeTransaction = bankGuaranteeTransaction;
    }

    public org.museframework.bian.bankguarantee.dto.cr.BankGuaranteeTransaction getBankGuaranteeTransaction() {
        return bankGuaranteeTransaction;
    }
}