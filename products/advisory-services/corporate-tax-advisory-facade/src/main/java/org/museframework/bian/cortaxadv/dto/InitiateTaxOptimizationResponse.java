package org.museframework.bian.cortaxadv.dto;

public class InitiateTaxOptimizationResponse {
    private org.museframework.bian.cortaxadv.dto.bq.TaxOptimization taxOptimization;

    public void setTaxOptimization(org.museframework.bian.cortaxadv.dto.bq.TaxOptimization taxOptimization) {
        this.taxOptimization = taxOptimization;
    }

    public org.museframework.bian.cortaxadv.dto.bq.TaxOptimization getTaxOptimization() {
        return taxOptimization;
    }
}