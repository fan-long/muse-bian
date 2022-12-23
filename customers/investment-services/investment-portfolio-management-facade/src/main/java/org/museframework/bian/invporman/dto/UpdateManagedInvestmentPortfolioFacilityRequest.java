package org.museframework.bian.invporman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateManagedInvestmentPortfolioFacilityRequest {
    @MetaField
    private String investmentportfoliomanagementid;

    @MetaField(ref=true)
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