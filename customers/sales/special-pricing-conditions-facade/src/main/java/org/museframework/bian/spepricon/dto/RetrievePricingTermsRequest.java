package org.museframework.bian.spepricon.dto;

public class RetrievePricingTermsRequest {
    private String specialpricingconditionsid;

    private String pricingtermsid;

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
}