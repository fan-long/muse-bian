package org.museframework.bian.cortaxadv.dto;

public class UpdateTaxOptimizationResponse {
    private org.museframework.bian.cortaxadv.dto.bq.TaxOptimization taxOptimization;

    public void setTaxOptimization(org.museframework.bian.cortaxadv.dto.bq.TaxOptimization taxOptimization) {
        this.taxOptimization = taxOptimization;
    }

    public org.museframework.bian.cortaxadv.dto.bq.TaxOptimization getTaxOptimization() {
        return taxOptimization;
    }
}