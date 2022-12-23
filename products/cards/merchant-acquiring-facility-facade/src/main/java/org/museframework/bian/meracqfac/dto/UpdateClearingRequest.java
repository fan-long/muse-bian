package org.museframework.bian.meracqfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateClearingRequest {
    @MetaField
    private String merchantacquiringfacilityid;

    @MetaField
    private String clearingid;

    @MetaField(ref=true)
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