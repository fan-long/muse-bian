package org.museframework.bian.trabooove.dto;

public class RetrieveTradingBookRiskMitigationDutyRequest {
    private String tradingbookoversightid;

    private String tradingbookriskmitigationdutyid;

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
}