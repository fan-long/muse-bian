package org.museframework.bian.invporman.dto;

public class RequestManagedInvestmentPortfolioFacilityRequest {
    private String investmentportfoliomanagementid;

    private org.museframework.bian.invporman.dto.cr.ManagedInvestmentPortfolioFacility managedInvestmentPortfolioFacility;

    public void setInvestmentportfoliomanagementid(String investmentportfoliomanagementid) {
        this.investmentportfoliomanagementid = investmentportfoliomanagementid;
    }

    public String getInvestmentportfoliomanagementid() {
        return investmentportfoliomanagementid;
    }

    public void setManagedInvestmentPortfolioFacility(org.museframework.bian.invporman.dto.cr.ManagedInvestmentPortfolioFacility managedInvestmentPortfolioFacility) {
        this.managedInvestmentPortfolioFacility = managedInvestmentPortfolioFacility;
    }

    public org.museframework.bian.invporman.dto.cr.ManagedInvestmentPortfolioFacility getManagedInvestmentPortfolioFacility() {
        return managedInvestmentPortfolioFacility;
    }
}