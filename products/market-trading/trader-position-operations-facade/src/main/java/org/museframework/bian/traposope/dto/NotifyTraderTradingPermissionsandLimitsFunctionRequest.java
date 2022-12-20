package org.museframework.bian.traposope.dto;

public class NotifyTraderTradingPermissionsandLimitsFunctionRequest {
    private String traderpositionoperationsid;

    private String tradertradingpermissionsandlimitsfunctionid;

    public void setTraderpositionoperationsid(String traderpositionoperationsid) {
        this.traderpositionoperationsid = traderpositionoperationsid;
    }

    public String getTraderpositionoperationsid() {
        return traderpositionoperationsid;
    }

    public void setTradertradingpermissionsandlimitsfunctionid(String tradertradingpermissionsandlimitsfunctionid) {
        this.tradertradingpermissionsandlimitsfunctionid = tradertradingpermissionsandlimitsfunctionid;
    }

    public String getTradertradingpermissionsandlimitsfunctionid() {
        return tradertradingpermissionsandlimitsfunctionid;
    }
}