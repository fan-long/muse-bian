package org.museframework.bian.merchantrelations.dto;

public class RetrieveOperationalTermResponse {
    private org.museframework.bian.merchantrelations.dto.bq.OperationalTerm operationalTerm;

    public void setOperationalTerm(org.museframework.bian.merchantrelations.dto.bq.OperationalTerm operationalTerm) {
        this.operationalTerm = operationalTerm;
    }

    public org.museframework.bian.merchantrelations.dto.bq.OperationalTerm getOperationalTerm() {
        return operationalTerm;
    }
}