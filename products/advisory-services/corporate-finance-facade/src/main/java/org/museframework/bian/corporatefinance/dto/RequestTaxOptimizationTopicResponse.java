package org.museframework.bian.corporatefinance.dto;

public class RequestTaxOptimizationTopicResponse {
    private org.museframework.bian.corporatefinance.dto.bq.TaxOptimizationTopic taxOptimizationTopic;

    public void setTaxOptimizationTopic(org.museframework.bian.corporatefinance.dto.bq.TaxOptimizationTopic taxOptimizationTopic) {
        this.taxOptimizationTopic = taxOptimizationTopic;
    }

    public org.museframework.bian.corporatefinance.dto.bq.TaxOptimizationTopic getTaxOptimizationTopic() {
        return taxOptimizationTopic;
    }
}