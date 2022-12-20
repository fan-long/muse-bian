package org.museframework.bian.tradeclearing.dto;

public class RetrieveMarketTradeFundsandSecurityAvailabilityAssuranceWorkstepRequest {
    private String tradeclearingid;

    private String markettradefundsandsecurityavailabilityassuranceworkstepid;

    public void setTradeclearingid(String tradeclearingid) {
        this.tradeclearingid = tradeclearingid;
    }

    public String getTradeclearingid() {
        return tradeclearingid;
    }

    public void setMarkettradefundsandsecurityavailabilityassuranceworkstepid(String markettradefundsandsecurityavailabilityassuranceworkstepid) {
        this.markettradefundsandsecurityavailabilityassuranceworkstepid = markettradefundsandsecurityavailabilityassuranceworkstepid;
    }

    public String getMarkettradefundsandsecurityavailabilityassuranceworkstepid() {
        return markettradefundsandsecurityavailabilityassuranceworkstepid;
    }
}