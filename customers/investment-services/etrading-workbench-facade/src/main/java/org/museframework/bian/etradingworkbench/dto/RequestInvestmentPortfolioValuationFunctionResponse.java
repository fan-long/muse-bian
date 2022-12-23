package org.museframework.bian.etradingworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestInvestmentPortfolioValuationFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.etradingworkbench.dto.bq.InvestmentPortfolioValuationFunction investmentPortfolioValuationFunction;

    public void setInvestmentPortfolioValuationFunction(org.museframework.bian.etradingworkbench.dto.bq.InvestmentPortfolioValuationFunction investmentPortfolioValuationFunction) {
        this.investmentPortfolioValuationFunction = investmentPortfolioValuationFunction;
    }

    public org.museframework.bian.etradingworkbench.dto.bq.InvestmentPortfolioValuationFunction getInvestmentPortfolioValuationFunction() {
        return investmentPortfolioValuationFunction;
    }
}