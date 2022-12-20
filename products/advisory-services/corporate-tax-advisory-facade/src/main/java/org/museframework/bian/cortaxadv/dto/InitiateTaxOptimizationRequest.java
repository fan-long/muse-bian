package org.museframework.bian.cortaxadv.dto;

public class InitiateTaxOptimizationRequest {
    private String corporatetaxadvisoryid;

    private String taxoptimizationid;

    private org.museframework.bian.cortaxadv.dto.bq.TaxOptimization taxOptimization;

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

    public void setTaxOptimization(org.museframework.bian.cortaxadv.dto.bq.TaxOptimization taxOptimization) {
        this.taxOptimization = taxOptimization;
    }

    public org.museframework.bian.cortaxadv.dto.bq.TaxOptimization getTaxOptimization() {
        return taxOptimization;
    }
}