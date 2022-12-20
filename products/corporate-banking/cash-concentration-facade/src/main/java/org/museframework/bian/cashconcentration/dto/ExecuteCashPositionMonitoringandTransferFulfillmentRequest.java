package org.museframework.bian.cashconcentration.dto;

public class ExecuteCashPositionMonitoringandTransferFulfillmentRequest {
    private String cashconcentrationid;

    private String cashpositionmonitoringandtransferfulfillmentid;

    private org.museframework.bian.cashconcentration.dto.bq.CashPositionMonitoringandTransferFulfillment cashPositionMonitoringandTransferFulfillment;

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

    public void setCashPositionMonitoringandTransferFulfillment(org.museframework.bian.cashconcentration.dto.bq.CashPositionMonitoringandTransferFulfillment cashPositionMonitoringandTransferFulfillment) {
        this.cashPositionMonitoringandTransferFulfillment = cashPositionMonitoringandTransferFulfillment;
    }

    public org.museframework.bian.cashconcentration.dto.bq.CashPositionMonitoringandTransferFulfillment getCashPositionMonitoringandTransferFulfillment() {
        return cashPositionMonitoringandTransferFulfillment;
    }
}