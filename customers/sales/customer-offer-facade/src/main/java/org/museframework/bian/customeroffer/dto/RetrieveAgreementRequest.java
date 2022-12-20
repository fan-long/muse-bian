package org.museframework.bian.customeroffer.dto;

public class RetrieveAgreementRequest {
    private String customerofferid;

    private String agreementid;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setAgreementid(String agreementid) {
        this.agreementid = agreementid;
    }

    public String getAgreementid() {
        return agreementid;
    }
}