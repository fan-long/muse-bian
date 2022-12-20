package org.museframework.bian.corbanope.dto;

public class RetrieveClearingandSettlementResponse {
    private org.museframework.bian.corbanope.dto.bq.ClearingandSettlement clearingandSettlement;

    public void setClearingandSettlement(org.museframework.bian.corbanope.dto.bq.ClearingandSettlement clearingandSettlement) {
        this.clearingandSettlement = clearingandSettlement;
    }

    public org.museframework.bian.corbanope.dto.bq.ClearingandSettlement getClearingandSettlement() {
        return clearingandSettlement;
    }
}