package org.museframework.bian.disbursement.dto;

public class ExecuteDisbursementTransactionResponse {
    private org.museframework.bian.disbursement.dto.cr.DisbursementTransaction disbursementTransaction;

    public void setDisbursementTransaction(org.museframework.bian.disbursement.dto.cr.DisbursementTransaction disbursementTransaction) {
        this.disbursementTransaction = disbursementTransaction;
    }

    public org.museframework.bian.disbursement.dto.cr.DisbursementTransaction getDisbursementTransaction() {
        return disbursementTransaction;
    }
}