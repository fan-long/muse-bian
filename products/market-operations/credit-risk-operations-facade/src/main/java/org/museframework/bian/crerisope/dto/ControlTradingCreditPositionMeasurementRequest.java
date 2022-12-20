package org.museframework.bian.crerisope.dto;

public class ControlTradingCreditPositionMeasurementRequest {
    private String creditriskoperationsid;

    private org.museframework.bian.crerisope.dto.cr.TradingCreditPositionMeasurement tradingCreditPositionMeasurement;

    public void setCreditriskoperationsid(String creditriskoperationsid) {
        this.creditriskoperationsid = creditriskoperationsid;
    }

    public String getCreditriskoperationsid() {
        return creditriskoperationsid;
    }

    public void setTradingCreditPositionMeasurement(org.museframework.bian.crerisope.dto.cr.TradingCreditPositionMeasurement tradingCreditPositionMeasurement) {
        this.tradingCreditPositionMeasurement = tradingCreditPositionMeasurement;
    }

    public org.museframework.bian.crerisope.dto.cr.TradingCreditPositionMeasurement getTradingCreditPositionMeasurement() {
        return tradingCreditPositionMeasurement;
    }
}