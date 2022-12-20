package org.museframework.bian.investmentaccount.dto;

public class UpdateInvestmentAccountFacilityRequest {
    private String investmentaccountid;

    private org.museframework.bian.investmentaccount.dto.cr.InvestmentAccountFacility investmentAccountFacility;

    public void setInvestmentaccountid(String investmentaccountid) {
        this.investmentaccountid = investmentaccountid;
    }

    public String getInvestmentaccountid() {
        return investmentaccountid;
    }

    public void setInvestmentAccountFacility(org.museframework.bian.investmentaccount.dto.cr.InvestmentAccountFacility investmentAccountFacility) {
        this.investmentAccountFacility = investmentAccountFacility;
    }

    public org.museframework.bian.investmentaccount.dto.cr.InvestmentAccountFacility getInvestmentAccountFacility() {
        return investmentAccountFacility;
    }
}