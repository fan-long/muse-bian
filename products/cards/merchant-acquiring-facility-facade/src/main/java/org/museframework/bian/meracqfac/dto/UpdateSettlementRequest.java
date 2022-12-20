package org.museframework.bian.meracqfac.dto;

public class UpdateSettlementRequest {
    private String merchantacquiringfacilityid;

    private String settlementid;

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