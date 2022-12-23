package org.museframework.bian.invporpla.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestManagedInvestmentPortfolioAgreementRequest {
    @MetaField
    private String investmentportfolioplanningid;

    @MetaField(ref=true)
    private org.museframework.bian.invporpla.dto.cr.ManagedInvestmentPortfolioAgreement managedInvestmentPortfolioAgreement;

    public void setInvestmentportfolioplanningid(String investmentportfolioplanningid) {
        this.investmentportfolioplanningid = investmentportfolioplanningid;
    }

    public String getInvestmentportfolioplanningid() {
        return investmentportfolioplanningid;
    }

    public void setManagedInvestmentPortfolioAgreement(org.museframework.bian.invporpla.dto.cr.ManagedInvestmentPortfolioAgreement managedInvestmentPortfolioAgreement) {
        this.managedInvestmentPortfolioAgreement = managedInvestmentPortfolioAgreement;
    }

    public org.museframework.bian.invporpla.dto.cr.ManagedInvestmentPortfolioAgreement getManagedInvestmentPortfolioAgreement() {
        return managedInvestmentPortfolioAgreement;
    }
}