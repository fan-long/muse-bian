package org.museframework.bian.meracqfac.dto;

public class UpdateSettlementResponse {
    private org.museframework.bian.meracqfac.dto.bq.Settlement settlement;

    public void setSettlement(org.museframework.bian.meracqfac.dto.bq.Settlement settlement) {
        this.settlement = settlement;
    }

    public org.museframework.bian.meracqfac.dto.bq.Settlement getSettlement() {
        return settlement;
    }
}