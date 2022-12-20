package org.museframework.bian.invporman.dto;

public class RequestManagedInvestmentPortfolioFacilityResponse {
    private org.museframework.bian.invporman.dto.cr.ManagedInvestmentPortfolioFacility managedInvestmentPortfolioFacility;

    public void setManagedInvestmentPortfolioFacility(org.museframework.bian.invporman.dto.cr.ManagedInvestmentPortfolioFacility managedInvestmentPortfolioFacility) {
        this.managedInvestmentPortfolioFacility = managedInvestmentPortfolioFacility;
    }

    public org.museframework.bian.invporman.dto.cr.ManagedInvestmentPortfolioFacility getManagedInvestmentPortfolioFacility() {
        return managedInvestmentPortfolioFacility;
    }
}