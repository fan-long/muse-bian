package org.museframework.bian.loan.dto;

public class RetrieveDisbursementResponse {
    private org.museframework.bian.loan.dto.bq.Disbursement disbursement;

    public void setDisbursement(org.museframework.bian.loan.dto.bq.Disbursement disbursement) {
        this.disbursement = disbursement;
    }

    public org.museframework.bian.loan.dto.bq.Disbursement getDisbursement() {
        return disbursement;
    }
}