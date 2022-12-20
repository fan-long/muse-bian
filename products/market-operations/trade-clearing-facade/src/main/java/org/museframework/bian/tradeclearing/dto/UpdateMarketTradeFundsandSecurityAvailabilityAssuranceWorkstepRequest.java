package org.museframework.bian.tradeclearing.dto;

public class UpdateMarketTradeFundsandSecurityAvailabilityAssuranceWorkstepRequest {
    private String tradeclearingid;

    private String markettradefundsandsecurityavailabilityassuranceworkstepid;

    private org.museframework.bian.tradeclearing.dto.bq.MarketTradeFundsandSecurityAvailabilityAssuranceWorkstep marketTradeFundsandSecurityAvailabilityAssuranceWorkstep;

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

    public void setMarketTradeFundsandSecurityAvailabilityAssuranceWorkstep(org.museframework.bian.tradeclearing.dto.bq.MarketTradeFundsandSecurityAvailabilityAssuranceWorkstep marketTradeFundsandSecurityAvailabilityAssuranceWorkstep) {
        this.marketTradeFundsandSecurityAvailabilityAssuranceWorkstep = marketTradeFundsandSecurityAvailabilityAssuranceWorkstep;
    }

    public org.museframework.bian.tradeclearing.dto.bq.MarketTradeFundsandSecurityAvailabilityAssuranceWorkstep getMarketTradeFundsandSecurityAvailabilityAssuranceWorkstep() {
        return marketTradeFundsandSecurityAvailabilityAssuranceWorkstep;
    }
}