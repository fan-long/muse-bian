package org.museframework.bian.corporatefinance.dto;

public class ExecuteTaxOptimizationTopicRequest {
    private String corporatefinanceid;

    private String taxoptimizationtopicid;

    private org.museframework.bian.corporatefinance.dto.bq.TaxOptimizationTopic taxOptimizationTopic;

    public void setCorporatefinanceid(String corporatefinanceid) {
        this.corporatefinanceid = corporatefinanceid;
    }

    public String getCorporatefinanceid() {
        return corporatefinanceid;
    }

    public void setTaxoptimizationtopicid(String taxoptimizationtopicid) {
        this.taxoptimizationtopicid = taxoptimizationtopicid;
    }

    public String getTaxoptimizationtopicid() {
        return taxoptimizationtopicid;
    }

    public void setTaxOptimizationTopic(org.museframework.bian.corporatefinance.dto.bq.TaxOptimizationTopic taxOptimizationTopic) {
        this.taxOptimizationTopic = taxOptimizationTopic;
    }

    public org.museframework.bian.corporatefinance.dto.bq.TaxOptimizationTopic getTaxOptimizationTopic() {
        return taxOptimizationTopic;
    }
}