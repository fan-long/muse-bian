package org.museframework.bian.trustservices.dto;

public class NotifyTrustEstate_InheritanceandIncomeTaxFulfillmentRequest {
    private String trustservicesid;

    private String trustestate_inheritanceandincometaxfulfillmentid;

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
}