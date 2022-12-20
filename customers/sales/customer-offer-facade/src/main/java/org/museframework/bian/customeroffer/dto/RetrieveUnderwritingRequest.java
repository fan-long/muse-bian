package org.museframework.bian.customeroffer.dto;

public class RetrieveUnderwritingRequest {
    private String customerofferid;

    private String underwritingid;

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
}