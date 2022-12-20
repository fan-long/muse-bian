package org.museframework.bian.customeroffer.dto;

public class UpdateDisclosuresRequest {
    private String customerofferid;

    private String disclosuresid;

    private org.museframework.bian.customeroffer.dto.bq.Disclosures disclosures;

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

    public void setDisclosures(org.museframework.bian.customeroffer.dto.bq.Disclosures disclosures) {
        this.disclosures = disclosures;
    }

    public org.museframework.bian.customeroffer.dto.bq.Disclosures getDisclosures() {
        return disclosures;
    }
}