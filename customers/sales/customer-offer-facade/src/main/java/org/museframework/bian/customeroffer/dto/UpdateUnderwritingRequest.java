package org.museframework.bian.customeroffer.dto;

public class UpdateUnderwritingRequest {
    private String customerofferid;

    private String underwritingid;

    private org.museframework.bian.customeroffer.dto.bq.Underwriting underwriting;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setUnderwritingid(String underwritingid) {
        this.underwritingid = underwritingid;
    }

    public String getUnderwritingid() {
        return underwritingid;
    }

    public void setUnderwriting(org.museframework.bian.customeroffer.dto.bq.Underwriting underwriting) {
        this.underwriting = underwriting;
    }

    public org.museframework.bian.customeroffer.dto.bq.Underwriting getUnderwriting() {
        return underwriting;
    }
}