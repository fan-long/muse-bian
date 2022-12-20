package org.museframework.bian.customeroffer.dto;

public class RetrieveDisclosuresRequest {
    private String customerofferid;

    private String disclosuresid;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setDisclosuresid(String disclosuresid) {
        this.disclosuresid = disclosuresid;
    }

    public String getDisclosuresid() {
        return disclosuresid;
    }
}