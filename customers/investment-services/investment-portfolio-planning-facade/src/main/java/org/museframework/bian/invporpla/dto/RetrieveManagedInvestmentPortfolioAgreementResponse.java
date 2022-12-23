package org.museframework.bian.invporpla.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveManagedInvestmentPortfolioAgreementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.invporpla.dto.cr.ManagedInvestmentPortfolioAgreement managedInvestmentPortfolioAgreement;

    public void setManagedInvestmentPortfolioAgreement(org.museframework.bian.invporpla.dto.cr.ManagedInvestmentPortfolioAgreement managedInvestmentPortfolioAgreement) {
        this.managedInvestmentPortfolioAgreement = managedInvestmentPortfolioAgreement;
    }

    public org.museframework.bian.invporpla.dto.cr.ManagedInvestmentPortfolioAgreement getManagedInvestmentPortfolioAgreement() {
        return managedInvestmentPortfolioAgreement;
    }
}