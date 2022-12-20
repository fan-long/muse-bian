package org.museframework.bian.consumerloan.dto;

public class RetrieveDisbursementResponse {
    private org.museframework.bian.consumerloan.dto.bq.Disbursement disbursement;

    public void setDisbursement(org.museframework.bian.consumerloan.dto.bq.Disbursement disbursement) {
        this.disbursement = disbursement;
    }

    public org.museframework.bian.consumerloan.dto.bq.Disbursement getDisbursement() {
        return disbursement;
    }
}