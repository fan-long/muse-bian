package org.museframework.bian.merchantrelations.dto;

public class EvaluateOperationalTermRequest {
    private String merchantrelationsid;

    private String operationaltermid;

    private org.museframework.bian.merchantrelations.dto.bq.OperationalTerm operationalTerm;

    public void setMerchantrelationsid(String merchantrelationsid) {
        this.merchantrelationsid = merchantrelationsid;
    }

    public String getMerchantrelationsid() {
        return merchantrelationsid;
    }

    public void setOperationaltermid(String operationaltermid) {
        this.operationaltermid = operationaltermid;
    }

    public String getOperationaltermid() {
        return operationaltermid;
    }

    public void setOperationalTerm(org.museframework.bian.merchantrelations.dto.bq.OperationalTerm operationalTerm) {
        this.operationalTerm = operationalTerm;
    }

    public org.museframework.bian.merchantrelations.dto.bq.OperationalTerm getOperationalTerm() {
        return operationalTerm;
    }
}