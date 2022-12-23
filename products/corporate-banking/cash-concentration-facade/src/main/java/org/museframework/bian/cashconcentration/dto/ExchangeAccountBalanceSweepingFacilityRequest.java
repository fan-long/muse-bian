package org.museframework.bian.cashconcentration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeAccountBalanceSweepingFacilityRequest {
    @MetaField
    private String cashconcentrationid;

    @MetaField(ref=true)
    private org.museframework.bian.cashconcentration.dto.cr.AccountBalanceSweepingFacility accountBalanceSweepingFacility;

    public void setCashconcentrationid(String cashconcentrationid) {
        this.cashconcentrationid = cashconcentrationid;
    }

    public String getCashconcentrationid() {
        return cashconcentrationid;
    }

    public void setAccountBalanceSweepingFacility(org.museframework.bian.cashconcentration.dto.cr.AccountBalanceSweepingFacility accountBalanceSweepingFacility) {
        this.accountBalanceSweepingFacility = accountBalanceSweepingFacility;
    }

    public org.museframework.bian.cashconcentration.dto.cr.AccountBalanceSweepingFacility getAccountBalanceSweepingFacility() {
        return accountBalanceSweepingFacility;
    }
}