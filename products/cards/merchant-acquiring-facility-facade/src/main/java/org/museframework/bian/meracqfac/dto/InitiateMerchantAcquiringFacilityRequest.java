package org.museframework.bian.meracqfac.dto;

public class InitiateMerchantAcquiringFacilityRequest {
    private org.museframework.bian.meracqfac.dto.cr.MerchantAcquiringFacility merchantAcquiringFacility;

    public void setMerchantAcquiringFacility(org.museframework.bian.meracqfac.dto.cr.MerchantAcquiringFacility merchantAcquiringFacility) {
        this.merchantAcquiringFacility = merchantAcquiringFacility;
    }

    public org.museframework.bian.meracqfac.dto.cr.MerchantAcquiringFacility getMerchantAcquiringFacility() {
        return merchantAcquiringFacility;
    }
}