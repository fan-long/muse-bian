/*An operational service or function supported within the Transaction Reporting Function for doing Transaction Reporting Function*/
package org.museframework.bian.traandprirep.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TradeandPriceReportingOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Event tradeandPriceReportingIncident;

    /**/
    @MetaField
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