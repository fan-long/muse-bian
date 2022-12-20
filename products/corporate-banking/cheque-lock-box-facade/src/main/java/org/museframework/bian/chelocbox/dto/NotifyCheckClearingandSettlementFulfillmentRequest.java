package org.museframework.bian.chelocbox.dto;

public class NotifyCheckClearingandSettlementFulfillmentRequest {
    private String chequelockboxid;

    private String checkclearingandsettlementfulfillmentid;

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
}