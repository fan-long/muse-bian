package org.museframework.bian.colassadm.dto;

public class RetrieveValuationResponse {
    private org.museframework.bian.colassadm.dto.bq.Valuation valuation;

    public void setValuation(org.museframework.bian.colassadm.dto.bq.Valuation valuation) {
        this.valuation = valuation;
    }

    public org.museframework.bian.colassadm.dto.bq.Valuation getValuation() {
        return valuation;
    }
}