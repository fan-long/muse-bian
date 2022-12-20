package org.museframework.bian.trabooove.dto;

public class ExchangeTradingBookRiskMitigationDutyRequest {
    private String tradingbookoversightid;

    private String tradingbookriskmitigationdutyid;

    private org.museframework.bian.trabooove.dto.bq.TradingBookRiskMitigationDuty tradingBookRiskMitigationDuty;

    public void setTradingbookoversightid(String tradingbookoversightid) {
        this.tradingbookoversightid = tradingbookoversightid;
    }

    public String getTradingbookoversightid() {
        return tradingbookoversightid;
    }

    public void setTradingbookriskmitigationdutyid(String tradingbookriskmitigationdutyid) {
        this.tradingbookriskmitigationdutyid = tradingbookriskmitigationdutyid;
    }

    public String getTradingbookriskmitigationdutyid() {
        return tradingbookriskmitigationdutyid;
    }

    public void setTradingBookRiskMitigationDuty(org.museframework.bian.trabooove.dto.bq.TradingBookRiskMitigationDuty tradingBookRiskMitigationDuty) {
        this.tradingBookRiskMitigationDuty = tradingBookRiskMitigationDuty;
    }

    public org.museframework.bian.trabooove.dto.bq.TradingBookRiskMitigationDuty getTradingBookRiskMitigationDuty() {
        return tradingBookRiskMitigationDuty;
    }
}