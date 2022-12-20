package org.museframework.bian.traposope.dto;

public class UpdateTraderTradingPermissionsandLimitsFunctionRequest {
    private String traderpositionoperationsid;

    private String tradertradingpermissionsandlimitsfunctionid;

    private org.museframework.bian.traposope.dto.bq.TraderTradingPermissionsandLimitsFunction traderTradingPermissionsandLimitsFunction;

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

    public void setTraderTradingPermissionsandLimitsFunction(org.museframework.bian.traposope.dto.bq.TraderTradingPermissionsandLimitsFunction traderTradingPermissionsandLimitsFunction) {
        this.traderTradingPermissionsandLimitsFunction = traderTradingPermissionsandLimitsFunction;
    }

    public org.museframework.bian.traposope.dto.bq.TraderTradingPermissionsandLimitsFunction getTraderTradingPermissionsandLimitsFunction() {
        return traderTradingPermissionsandLimitsFunction;
    }
}