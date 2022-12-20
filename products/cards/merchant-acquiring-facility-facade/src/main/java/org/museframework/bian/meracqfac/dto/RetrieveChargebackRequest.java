package org.museframework.bian.meracqfac.dto;

public class RetrieveChargebackRequest {
    private String merchantacquiringfacilityid;

    private String chargebackid;

    public void setMerchantacquiringfacilityid(String merchantacquiringfacilityid) {
        this.merchantacquiringfacilityid = merchantacquiringfacilityid;
    }

    public String getMerchantacquiringfacilityid() {
        return merchantacquiringfacilityid;
    }

    public void setChargebackid(String chargebackid) {
        this.chargebackid = chargebackid;
    }

    public String getChargebackid() {
        return chargebackid;
    }
}