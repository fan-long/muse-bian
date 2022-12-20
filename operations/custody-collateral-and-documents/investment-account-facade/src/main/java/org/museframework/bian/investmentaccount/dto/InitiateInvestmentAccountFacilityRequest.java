package org.museframework.bian.investmentaccount.dto;

public class InitiateInvestmentAccountFacilityRequest {
    private org.museframework.bian.investmentaccount.dto.cr.InvestmentAccountFacility investmentAccountFacility;

    public void setInvestmentAccountFacility(org.museframework.bian.investmentaccount.dto.cr.InvestmentAccountFacility investmentAccountFacility) {
        this.investmentAccountFacility = investmentAccountFacility;
    }

    public org.museframework.bian.investmentaccount.dto.cr.InvestmentAccountFacility getInvestmentAccountFacility() {
        return investmentAccountFacility;
    }
}