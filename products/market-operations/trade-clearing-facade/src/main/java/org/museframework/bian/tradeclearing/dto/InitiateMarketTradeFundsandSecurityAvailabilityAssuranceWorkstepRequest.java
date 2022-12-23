package org.museframework.bian.tradeclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateMarketTradeFundsandSecurityAvailabilityAssuranceWorkstepRequest {
    @MetaField
    private String tradeclearingid;

    @MetaField
    private String markettradefundsandsecurityavailabilityassuranceworkstepid;

    @MetaField(ref=true)
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