package org.museframework.bian.conadvser.dto;

public class InitiateTaxOptimizationRequest {
    private String consumeradvisoryservicesid;

    private String taxoptimizationid;

    private org.museframework.bian.conadvser.dto.bq.TaxOptimization taxOptimization;

    public void setConsumeradvisoryservicesid(String consumeradvisoryservicesid) {
        this.consumeradvisoryservicesid = consumeradvisoryservicesid;
    }

    public String getConsumeradvisoryservicesid() {
        return consumeradvisoryservicesid;
    }

    public void setTaxoptimizationid(String taxoptimizationid) {
        this.taxoptimizationid = taxoptimizationid;
    }

    public String getTaxoptimizationid() {
        return taxoptimizationid;
    }

    public void setTaxOptimization(org.museframework.bian.conadvser.dto.bq.TaxOptimization taxOptimization) {
        this.taxOptimization = taxOptimization;
    }

    public org.museframework.bian.conadvser.dto.bq.TaxOptimization getTaxOptimization() {
        return taxOptimization;
    }
}