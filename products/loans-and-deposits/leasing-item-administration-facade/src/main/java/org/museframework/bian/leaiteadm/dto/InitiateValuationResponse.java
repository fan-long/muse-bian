package org.museframework.bian.leaiteadm.dto;

public class InitiateValuationResponse {
    private org.museframework.bian.leaiteadm.dto.bq.Valuation valuation;

    public void setValuation(org.museframework.bian.leaiteadm.dto.bq.Valuation valuation) {
        this.valuation = valuation;
    }

    public org.museframework.bian.leaiteadm.dto.bq.Valuation getValuation() {
        return valuation;
    }
}