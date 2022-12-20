package org.museframework.bian.meracqfac.dto;

public class UpdateMerchantAcquiringFacilityRequest {
    private String merchantacquiringfacilityid;

    private org.museframework.bian.meracqfac.dto.cr.MerchantAcquiringFacility merchantAcquiringFacility;

    public void setMerchantacquiringfacilityid(String merchantacquiringfacilityid) {
        this.merchantacquiringfacilityid = merchantacquiringfacilityid;
    }

    public String getMerchantacquiringfacilityid() {
        return merchantacquiringfacilityid;
    }

    public void setMerchantAcquiringFacility(org.museframework.bian.meracqfac.dto.cr.MerchantAcquiringFacility merchantAcquiringFacility) {
        this.merchantAcquiringFacility = merchantAcquiringFacility;
    }

    public org.museframework.bian.meracqfac.dto.cr.MerchantAcquiringFacility getMerchantAcquiringFacility() {
        return merchantAcquiringFacility;
    }
}