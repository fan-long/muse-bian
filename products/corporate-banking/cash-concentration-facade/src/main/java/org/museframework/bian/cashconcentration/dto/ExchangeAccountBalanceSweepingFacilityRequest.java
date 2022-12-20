package org.museframework.bian.cashconcentration.dto;

public class ExchangeAccountBalanceSweepingFacilityRequest {
    private String cashconcentrationid;

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