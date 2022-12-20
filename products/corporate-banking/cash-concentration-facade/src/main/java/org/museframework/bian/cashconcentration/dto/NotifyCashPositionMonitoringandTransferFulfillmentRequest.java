package org.museframework.bian.cashconcentration.dto;

public class NotifyCashPositionMonitoringandTransferFulfillmentRequest {
    private String cashconcentrationid;

    private String cashpositionmonitoringandtransferfulfillmentid;

    public void setCashconcentrationid(String cashconcentrationid) {
        this.cashconcentrationid = cashconcentrationid;
    }

    public String getCashconcentrationid() {
        return cashconcentrationid;
    }

    public void setCashpositionmonitoringandtransferfulfillmentid(String cashpositionmonitoringandtransferfulfillmentid) {
        this.cashpositionmonitoringandtransferfulfillmentid = cashpositionmonitoringandtransferfulfillmentid;
    }

    public String getCashpositionmonitoringandtransferfulfillmentid() {
        return cashpositionmonitoringandtransferfulfillmentid;
    }
}