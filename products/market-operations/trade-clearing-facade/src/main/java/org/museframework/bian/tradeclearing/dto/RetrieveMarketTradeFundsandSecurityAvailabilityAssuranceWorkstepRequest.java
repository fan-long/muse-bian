package org.museframework.bian.tradeclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveMarketTradeFundsandSecurityAvailabilityAssuranceWorkstepRequest {
    @MetaField
    private String tradeclearingid;

    @MetaField
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