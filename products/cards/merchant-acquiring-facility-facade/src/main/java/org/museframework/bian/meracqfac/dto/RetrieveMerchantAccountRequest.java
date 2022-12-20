package org.museframework.bian.meracqfac.dto;

public class RetrieveMerchantAccountRequest {
    private String merchantacquiringfacilityid;

    private String merchantaccountid;

    public void setMerchantacquiringfacilityid(String merchantacquiringfacilityid) {
        this.merchantacquiringfacilityid = merchantacquiringfacilityid;
    }

    public String getMerchantacquiringfacilityid() {
        return merchantacquiringfacilityid;
    }

    public void setMerchantaccountid(String merchantaccountid) {
        this.merchantaccountid = merchantaccountid;
    }

    public String getMerchantaccountid() {
        return merchantaccountid;
    }
}