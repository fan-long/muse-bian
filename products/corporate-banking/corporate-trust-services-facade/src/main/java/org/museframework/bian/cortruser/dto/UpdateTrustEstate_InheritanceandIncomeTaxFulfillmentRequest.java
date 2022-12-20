package org.museframework.bian.cortruser.dto;

public class UpdateTrustEstate_InheritanceandIncomeTaxFulfillmentRequest {
    private String corporatetrustservicesid;

    private String trustestate_inheritanceandincometaxfulfillmentid;

    private org.museframework.bian.cortruser.dto.bq.TrustEstate_InheritanceandIncomeTaxFulfillment trustEstate_InheritanceandIncomeTaxFulfillment;

    public void setCorporatetrustservicesid(String corporatetrustservicesid) {
        this.corporatetrustservicesid = corporatetrustservicesid;
    }

    public String getCorporatetrustservicesid() {
        return corporatetrustservicesid;
    }

    public void setTrustestate_inheritanceandincometaxfulfillmentid(String trustestate_inheritanceandincometaxfulfillmentid) {
        this.trustestate_inheritanceandincometaxfulfillmentid = trustestate_inheritanceandincometaxfulfillmentid;
    }

    public String getTrustestate_inheritanceandincometaxfulfillmentid() {
        return trustestate_inheritanceandincometaxfulfillmentid;
    }

    public void setTrustEstate_InheritanceandIncomeTaxFulfillment(org.museframework.bian.cortruser.dto.bq.TrustEstate_InheritanceandIncomeTaxFulfillment trustEstate_InheritanceandIncomeTaxFulfillment) {
        this.trustEstate_InheritanceandIncomeTaxFulfillment = trustEstate_InheritanceandIncomeTaxFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.TrustEstate_InheritanceandIncomeTaxFulfillment getTrustEstate_InheritanceandIncomeTaxFulfillment() {
        return trustEstate_InheritanceandIncomeTaxFulfillment;
    }
}