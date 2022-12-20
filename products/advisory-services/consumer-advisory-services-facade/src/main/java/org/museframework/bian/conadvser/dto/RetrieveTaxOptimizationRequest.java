package org.museframework.bian.conadvser.dto;

public class RetrieveTaxOptimizationRequest {
    private String consumeradvisoryservicesid;

    private String taxoptimizationid;

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
}