package org.museframework.bian.meracqfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMerchantAcquiringFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.meracqfac.dto.cr.MerchantAcquiringFacility merchantAcquiringFacility;

    public void setMerchantAcquiringFacility(org.museframework.bian.meracqfac.dto.cr.MerchantAcquiringFacility merchantAcquiringFacility) {
        this.merchantAcquiringFacility = merchantAcquiringFacility;
    }

    public org.museframework.bian.meracqfac.dto.cr.MerchantAcquiringFacility getMerchantAcquiringFacility() {
        return merchantAcquiringFacility;
    }
}