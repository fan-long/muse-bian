package org.museframework.bian.meracqfac.dto;

public class RetrieveClearingRequest {
    private String merchantacquiringfacilityid;

    private String clearingid;

    public void setMerchantacquiringfacilityid(String merchantacquiringfacilityid) {
        this.merchantacquiringfacilityid = merchantacquiringfacilityid;
    }

    public String getMerchantacquiringfacilityid() {
        return merchantacquiringfacilityid;
    }

    public void setClearingid(String clearingid) {
        this.clearingid = clearingid;
    }

    public String getClearingid() {
        return clearingid;
    }
}