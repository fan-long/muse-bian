package org.museframework.bian.cashconcentration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeAccountBalanceSweepingFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cashconcentration.dto.cr.AccountBalanceSweepingFacility accountBalanceSweepingFacility;

    public void setAccountBalanceSweepingFacility(org.museframework.bian.cashconcentration.dto.cr.AccountBalanceSweepingFacility accountBalanceSweepingFacility) {
        this.accountBalanceSweepingFacility = accountBalanceSweepingFacility;
    }

    public org.museframework.bian.cashconcentration.dto.cr.AccountBalanceSweepingFacility getAccountBalanceSweepingFacility() {
        return accountBalanceSweepingFacility;
    }
}