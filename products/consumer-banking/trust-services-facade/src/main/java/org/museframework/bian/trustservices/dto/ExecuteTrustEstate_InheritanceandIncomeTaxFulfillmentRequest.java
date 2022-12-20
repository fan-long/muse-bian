package org.museframework.bian.trustservices.dto;

public class ExecuteTrustEstate_InheritanceandIncomeTaxFulfillmentRequest {
    private String trustservicesid;

    private String trustestate_inheritanceandincometaxfulfillmentid;

    private org.museframework.bian.trustservices.dto.bq.TrustEstate_InheritanceandIncomeTaxFulfillment trustEstate_InheritanceandIncomeTaxFulfillment;

    public void setTrustservicesid(String trustservicesid) {
        this.trustservicesid = trustservicesid;
    }

    public String getTrustservicesid() {
        return trustservicesid;
    }

    public void setTrustestate_inheritanceandincometaxfulfillmentid(String trustestate_inheritanceandincometaxfulfillmentid) {
        this.trustestate_inheritanceandincometaxfulfillmentid = trustestate_inheritanceandincometaxfulfillmentid;
    }

    public String getTrustestate_inheritanceandincometaxfulfillmentid() {
        return trustestate_inheritanceandincometaxfulfillmentid;
    }

    public void setTrustEstate_InheritanceandIncomeTaxFulfillment(org.museframework.bian.trustservices.dto.bq.TrustEstate_InheritanceandIncomeTaxFulfillment trustEstate_InheritanceandIncomeTaxFulfillment) {
        this.trustEstate_InheritanceandIncomeTaxFulfillment = trustEstate_InheritanceandIncomeTaxFulfillment;
    }

    public org.museframework.bian.trustservices.dto.bq.TrustEstate_InheritanceandIncomeTaxFulfillment getTrustEstate_InheritanceandIncomeTaxFulfillment() {
        return trustEstate_InheritanceandIncomeTaxFulfillment;
    }
}