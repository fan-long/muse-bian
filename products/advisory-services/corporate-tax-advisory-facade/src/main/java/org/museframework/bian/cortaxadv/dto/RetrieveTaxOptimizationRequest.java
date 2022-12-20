package org.museframework.bian.cortaxadv.dto;

public class RetrieveTaxOptimizationRequest {
    private String corporatetaxadvisoryid;

    private String taxoptimizationid;

    public void setCorporatetaxadvisoryid(String corporatetaxadvisoryid) {
        this.corporatetaxadvisoryid = corporatetaxadvisoryid;
    }

    public String getCorporatetaxadvisoryid() {
        return corporatetaxadvisoryid;
    }

    public void setTaxoptimizationid(String taxoptimizationid) {
        this.taxoptimizationid = taxoptimizationid;
    }

    public String getTaxoptimizationid() {
        return taxoptimizationid;
    }
}