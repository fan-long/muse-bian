package org.museframework.bian.meracqfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveSettlementRequest {
    @MetaField
    private String merchantacquiringfacilityid;

    @MetaField
    private String settlementid;

    public void setMerchantacquiringfacilityid(String merchantacquiringfacilityid) {
        this.merchantacquiringfacilityid = merchantacquiringfacilityid;
    }

    public String getMerchantacquiringfacilityid() {
        return merchantacquiringfacilityid;
    }

    public void setSettlementid(String settlementid) {
        this.settlementid = settlementid;
    }

    public String getSettlementid() {
        return settlementid;
    }
}