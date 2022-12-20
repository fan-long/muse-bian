/*An operational service or function supported within the Transaction Reporting Function for doing Transaction Reporting Function*/
package org.museframework.bian.traandprirep.dto.bq;

public class TradeandPriceReportingOutcome {
    /**/
    private org.museframework.bian.classes.Event tradeandPriceReportingIncident;

    /**/
    private String tradeandPriceReportingProvision;

    public void setTradeandPriceReportingIncident(org.museframework.bian.classes.Event tradeandPriceReportingIncident) {
        this.tradeandPriceReportingIncident = tradeandPriceReportingIncident;
    }

    public org.museframework.bian.classes.Event getTradeandPriceReportingIncident() {
        return tradeandPriceReportingIncident;
    }

    public void setTradeandPriceReportingProvision(String tradeandPriceReportingProvision) {
        this.tradeandPriceReportingProvision = tradeandPriceReportingProvision;
    }

    public String getTradeandPriceReportingProvision() {
        return tradeandPriceReportingProvision;
    }
}