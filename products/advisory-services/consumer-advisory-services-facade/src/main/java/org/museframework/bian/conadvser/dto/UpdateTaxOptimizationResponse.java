package org.museframework.bian.conadvser.dto;

public class UpdateTaxOptimizationResponse {
    private org.museframework.bian.conadvser.dto.bq.TaxOptimization taxOptimization;

    public void setTaxOptimization(org.museframework.bian.conadvser.dto.bq.TaxOptimization taxOptimization) {
        this.taxOptimization = taxOptimization;
    }

    public org.museframework.bian.conadvser.dto.bq.TaxOptimization getTaxOptimization() {
        return taxOptimization;
    }
}