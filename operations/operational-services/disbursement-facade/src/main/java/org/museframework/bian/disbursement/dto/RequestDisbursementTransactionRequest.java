package org.museframework.bian.disbursement.dto;

public class RequestDisbursementTransactionRequest {
    private String disbursementid;

    private org.museframework.bian.disbursement.dto.cr.DisbursementTransaction disbursementTransaction;

    public void setDisbursementid(String disbursementid) {
        this.disbursementid = disbursementid;
    }

    public String getDisbursementid() {
        return disbursementid;
    }

    public void setDisbursementTransaction(org.museframework.bian.disbursement.dto.cr.DisbursementTransaction disbursementTransaction) {
        this.disbursementTransaction = disbursementTransaction;
    }

    public org.museframework.bian.disbursement.dto.cr.DisbursementTransaction getDisbursementTransaction() {
        return disbursementTransaction;
    }
}