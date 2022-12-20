package org.museframework.bian.customeroffer.dto;

public class UpdateAgreementRequest {
    private String customerofferid;

    private String agreementid;

    private org.museframework.bian.customeroffer.dto.bq.Agreement agreement;

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

    public void setAgreement(org.museframework.bian.customeroffer.dto.bq.Agreement agreement) {
        this.agreement = agreement;
    }

    public org.museframework.bian.customeroffer.dto.bq.Agreement getAgreement() {
        return agreement;
    }
}