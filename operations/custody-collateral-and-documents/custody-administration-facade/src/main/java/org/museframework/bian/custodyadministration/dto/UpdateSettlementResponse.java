package org.museframework.bian.custodyadministration.dto;

public class UpdateSettlementResponse {
    private org.museframework.bian.custodyadministration.dto.bq.Settlement settlement;

    public void setSettlement(org.museframework.bian.custodyadministration.dto.bq.Settlement settlement) {
        this.settlement = settlement;
    }

    public org.museframework.bian.custodyadministration.dto.bq.Settlement getSettlement() {
        return settlement;
    }
}