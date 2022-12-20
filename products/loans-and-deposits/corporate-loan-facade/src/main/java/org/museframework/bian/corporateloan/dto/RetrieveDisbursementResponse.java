package org.museframework.bian.corporateloan.dto;

public class RetrieveDisbursementResponse {
    private org.museframework.bian.corporateloan.dto.bq.Disbursement disbursement;

    public void setDisbursement(org.museframework.bian.corporateloan.dto.bq.Disbursement disbursement) {
        this.disbursement = disbursement;
    }

    public org.museframework.bian.corporateloan.dto.bq.Disbursement getDisbursement() {
        return disbursement;
    }
}