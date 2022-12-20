package org.museframework.bian.chelocbox.dto;

public class ExchangeCheckClearingandSettlementFulfillmentRequest {
    private String chequelockboxid;

    private String checkclearingandsettlementfulfillmentid;

    private org.museframework.bian.chelocbox.dto.bq.CheckClearingandSettlementFulfillment checkClearingandSettlementFulfillment;

    public void setChequelockboxid(String chequelockboxid) {
        this.chequelockboxid = chequelockboxid;
    }

    public String getChequelockboxid() {
        return chequelockboxid;
    }

    public void setCheckclearingandsettlementfulfillmentid(String checkclearingandsettlementfulfillmentid) {
        this.checkclearingandsettlementfulfillmentid = checkclearingandsettlementfulfillmentid;
    }

    public String getCheckclearingandsettlementfulfillmentid() {
        return checkclearingandsettlementfulfillmentid;
    }

    public void setCheckClearingandSettlementFulfillment(org.museframework.bian.chelocbox.dto.bq.CheckClearingandSettlementFulfillment checkClearingandSettlementFulfillment) {
        this.checkClearingandSettlementFulfillment = checkClearingandSettlementFulfillment;
    }

    public org.museframework.bian.chelocbox.dto.bq.CheckClearingandSettlementFulfillment getCheckClearingandSettlementFulfillment() {
        return checkClearingandSettlementFulfillment;
    }
}