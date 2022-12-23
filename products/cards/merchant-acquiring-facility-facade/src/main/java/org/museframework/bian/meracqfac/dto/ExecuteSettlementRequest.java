package org.museframework.bian.meracqfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteSettlementRequest {
    @MetaField
    private String merchantacquiringfacilityid;

    @MetaField
    private String settlementid;

    @MetaField(ref=true)
    private org.museframework.bian.meracqfac.dto.bq.Settlement settlement;

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

    public void setSettlement(org.museframework.bian.meracqfac.dto.bq.Settlement settlement) {
        this.settlement = settlement;
    }

    public org.museframework.bian.meracqfac.dto.bq.Settlement getSettlement() {
        return settlement;
    }
}