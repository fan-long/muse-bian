package org.museframework.bian.meracqfac.dto;

public class UpdateClearingRequest {
    private String merchantacquiringfacilityid;

    private String clearingid;

    private org.museframework.bian.meracqfac.dto.bq.Clearing clearing;

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

    public void setClearing(org.museframework.bian.meracqfac.dto.bq.Clearing clearing) {
        this.clearing = clearing;
    }

    public org.museframework.bian.meracqfac.dto.bq.Clearing getClearing() {
        return clearing;
    }
}