package org.museframework.bian.meracqfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveMerchantAccountRequest {
    @MetaField
    private String merchantacquiringfacilityid;

    @MetaField
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