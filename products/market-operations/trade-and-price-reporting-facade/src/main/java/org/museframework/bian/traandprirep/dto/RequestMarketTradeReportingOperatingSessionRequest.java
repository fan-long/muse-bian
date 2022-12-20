package org.museframework.bian.traandprirep.dto;

public class RequestMarketTradeReportingOperatingSessionRequest {
    private String tradeandpricereportingid;

    private org.museframework.bian.traandprirep.dto.cr.MarketTradeReportingOperatingSession marketTradeReportingOperatingSession;

    public void setTradeandpricereportingid(String tradeandpricereportingid) {
        this.tradeandpricereportingid = tradeandpricereportingid;
    }

    public String getTradeandpricereportingid() {
        return tradeandpricereportingid;
    }

    public void setMarketTradeReportingOperatingSession(org.museframework.bian.traandprirep.dto.cr.MarketTradeReportingOperatingSession marketTradeReportingOperatingSession) {
        this.marketTradeReportingOperatingSession = marketTradeReportingOperatingSession;
    }

    public org.museframework.bian.traandprirep.dto.cr.MarketTradeReportingOperatingSession getMarketTradeReportingOperatingSession() {
        return marketTradeReportingOperatingSession;
    }
}