package org.museframework.bian.achoperations.dto;

public class RetrieveClearingandSettlementResponse {
    private org.museframework.bian.achoperations.dto.bq.ClearingandSettlement clearingandSettlement;

    public void setClearingandSettlement(org.museframework.bian.achoperations.dto.bq.ClearingandSettlement clearingandSettlement) {
        this.clearingandSettlement = clearingandSettlement;
    }

    public org.museframework.bian.achoperations.dto.bq.ClearingandSettlement getClearingandSettlement() {
        return clearingandSettlement;
    }
}