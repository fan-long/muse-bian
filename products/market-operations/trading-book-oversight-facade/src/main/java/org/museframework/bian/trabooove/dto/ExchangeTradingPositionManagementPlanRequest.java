package org.museframework.bian.trabooove.dto;

public class ExchangeTradingPositionManagementPlanRequest {
    private String tradingbookoversightid;

    private org.museframework.bian.trabooove.dto.cr.TradingPositionManagementPlan tradingPositionManagementPlan;

    public void setTradingbookoversightid(String tradingbookoversightid) {
        this.tradingbookoversightid = tradingbookoversightid;
    }

    public String getTradingbookoversightid() {
        return tradingbookoversightid;
    }

    public void setTradingPositionManagementPlan(org.museframework.bian.trabooove.dto.cr.TradingPositionManagementPlan tradingPositionManagementPlan) {
        this.tradingPositionManagementPlan = tradingPositionManagementPlan;
    }

    public org.museframework.bian.trabooove.dto.cr.TradingPositionManagementPlan getTradingPositionManagementPlan() {
        return tradingPositionManagementPlan;
    }
}