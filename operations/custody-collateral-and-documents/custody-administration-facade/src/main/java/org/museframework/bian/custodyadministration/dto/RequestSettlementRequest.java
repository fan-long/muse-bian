package org.museframework.bian.custodyadministration.dto;

public class RequestSettlementRequest {
    private String custodyadministrationid;

    private String settlementid;

    private org.museframework.bian.custodyadministration.dto.bq.Settlement settlement;

    public void setCustodyadministrationid(String custodyadministrationid) {
        this.custodyadministrationid = custodyadministrationid;
    }

    public String getCustodyadministrationid() {
        return custodyadministrationid;
    }

    public void setSettlementid(String settlementid) {
        this.settlementid = settlementid;
    }

    public String getSettlementid() {
        return settlementid;
    }

    public void setSettlement(org.museframework.bian.custodyadministration.dto.bq.Settlement settlement) {
        this.settlement = settlement;
    }

    public org.museframework.bian.custodyadministration.dto.bq.Settlement getSettlement() {
        return settlement;
    }
}