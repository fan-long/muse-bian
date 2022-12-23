package org.museframework.bian.meracqfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateMerchantAcquiringFacilityRequest {
    @MetaField
    private String merchantacquiringfacilityid;

    @MetaField(ref=true)
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