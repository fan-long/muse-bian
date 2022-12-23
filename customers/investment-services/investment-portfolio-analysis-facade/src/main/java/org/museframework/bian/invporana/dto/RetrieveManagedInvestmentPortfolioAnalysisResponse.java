package org.museframework.bian.invporana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveManagedInvestmentPortfolioAnalysisResponse {
    @MetaField(ref=true)
    private org.museframework.bian.invporana.dto.cr.ManagedInvestmentPortfolioAnalysis managedInvestmentPortfolioAnalysis;

    public void setManagedInvestmentPortfolioAnalysis(org.museframework.bian.invporana.dto.cr.ManagedInvestmentPortfolioAnalysis managedInvestmentPortfolioAnalysis) {
        this.managedInvestmentPortfolioAnalysis = managedInvestmentPortfolioAnalysis;
    }

    public org.museframework.bian.invporana.dto.cr.ManagedInvestmentPortfolioAnalysis getManagedInvestmentPortfolioAnalysis() {
        return managedInvestmentPortfolioAnalysis;
    }
}