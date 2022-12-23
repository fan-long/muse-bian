package org.museframework.bian.invporana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteManagedInvestmentPortfolioAnalysisRequest {
    @MetaField
    private String investmentportfolioanalysisid;

    @MetaField(ref=true)
    private org.museframework.bian.invporana.dto.cr.ManagedInvestmentPortfolioAnalysis managedInvestmentPortfolioAnalysis;

    public void setInvestmentportfolioanalysisid(String investmentportfolioanalysisid) {
        this.investmentportfolioanalysisid = investmentportfolioanalysisid;
    }

    public String getInvestmentportfolioanalysisid() {
        return investmentportfolioanalysisid;
    }

    public void setManagedInvestmentPortfolioAnalysis(org.museframework.bian.invporana.dto.cr.ManagedInvestmentPortfolioAnalysis managedInvestmentPortfolioAnalysis) {
        this.managedInvestmentPortfolioAnalysis = managedInvestmentPortfolioAnalysis;
    }

    public org.museframework.bian.invporana.dto.cr.ManagedInvestmentPortfolioAnalysis getManagedInvestmentPortfolioAnalysis() {
        return managedInvestmentPortfolioAnalysis;
    }
}