package org.museframework.bian.salproagr.dto;

public class EvaluatePolicyTermsRequest {
    private String salesproductagreementid;

    private String policytermsid;

    private org.museframework.bian.salproagr.dto.bq.PolicyTerms policyTerms;

    public void setSalesproductagreementid(String salesproductagreementid) {
        this.salesproductagreementid = salesproductagreementid;
    }

    public String getSalesproductagreementid() {
        return salesproductagreementid;
    }

    public void setPolicytermsid(String policytermsid) {
        this.policytermsid = policytermsid;
    }

    public String getPolicytermsid() {
        return policytermsid;
    }

    public void setPolicyTerms(org.museframework.bian.salproagr.dto.bq.PolicyTerms policyTerms) {
        this.policyTerms = policyTerms;
    }

    public org.museframework.bian.salproagr.dto.bq.PolicyTerms getPolicyTerms() {
        return policyTerms;
    }
}