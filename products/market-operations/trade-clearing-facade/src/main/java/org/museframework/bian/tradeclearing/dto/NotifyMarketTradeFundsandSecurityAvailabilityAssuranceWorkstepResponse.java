package org.museframework.bian.tradeclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyMarketTradeFundsandSecurityAvailabilityAssuranceWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.tradeclearing.dto.bq.MarketTradeFundsandSecurityAvailabilityAssuranceWorkstep marketTradeFundsandSecurityAvailabilityAssuranceWorkstep;

    public void setMarketTradeFundsandSecurityAvailabilityAssuranceWorkstep(org.museframework.bian.tradeclearing.dto.bq.MarketTradeFundsandSecurityAvailabilityAssuranceWorkstep marketTradeFundsandSecurityAvailabilityAssuranceWorkstep) {
        this.marketTradeFundsandSecurityAvailabilityAssuranceWorkstep = marketTradeFundsandSecurityAvailabilityAssuranceWorkstep;
    }

    public org.museframework.bian.tradeclearing.dto.bq.MarketTradeFundsandSecurityAvailabilityAssuranceWorkstep getMarketTradeFundsandSecurityAvailabilityAssuranceWorkstep() {
        return marketTradeFundsandSecurityAvailabilityAssuranceWorkstep;
    }
}