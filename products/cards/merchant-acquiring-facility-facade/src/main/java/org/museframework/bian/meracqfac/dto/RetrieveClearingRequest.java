package org.museframework.bian.meracqfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveClearingRequest {
    @MetaField
    private String merchantacquiringfacilityid;

    @MetaField
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