package org.museframework.bian.corporatefinance.dto;

public class RetrieveTaxOptimizationTopicRequest {
    private String corporatefinanceid;

    private String taxoptimizationtopicid;

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
}