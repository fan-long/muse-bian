package org.museframework.bian.spepricon.dto;

public class InitiatePricingTermsRequest {
    private String specialpricingconditionsid;

    private String pricingtermsid;

    private org.museframework.bian.spepricon.dto.bq.PricingTerms pricingTerms;

    public void setSpecialpricingconditionsid(String specialpricingconditionsid) {
        this.specialpricingconditionsid = specialpricingconditionsid;
    }

    public String getSpecialpricingconditionsid() {
        return specialpricingconditionsid;
    }

    public void setPricingtermsid(String pricingtermsid) {
        this.pricingtermsid = pricingtermsid;
    }

    public String getPricingtermsid() {
        return pricingtermsid;
    }

    public void setPricingTerms(org.museframework.bian.spepricon.dto.bq.PricingTerms pricingTerms) {
        this.pricingTerms = pricingTerms;
    }

    public org.museframework.bian.spepricon.dto.bq.PricingTerms getPricingTerms() {
        return pricingTerms;
    }
}