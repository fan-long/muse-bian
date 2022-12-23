package org.museframework.bian.etradingworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeInvestmentPortfolioValuationFunctionRequest {
    @MetaField
    private String etradingworkbenchid;

    @MetaField
    private String investmentportfoliovaluationfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.etradingworkbench.dto.bq.InvestmentPortfolioValuationFunction investmentPortfolioValuationFunction;

    public void setEtradingworkbenchid(String etradingworkbenchid) {
        this.etradingworkbenchid = etradingworkbenchid;
    }

    public String getEtradingworkbenchid() {
        return etradingworkbenchid;
    }

    public void setInvestmentportfoliovaluationfunctionid(String investmentportfoliovaluationfunctionid) {
        this.investmentportfoliovaluationfunctionid = investmentportfoliovaluationfunctionid;
    }

    public String getInvestmentportfoliovaluationfunctionid() {
        return investmentportfoliovaluationfunctionid;
    }

    public void setInvestmentPortfolioValuationFunction(org.museframework.bian.etradingworkbench.dto.bq.InvestmentPortfolioValuationFunction investmentPortfolioValuationFunction) {
        this.investmentPortfolioValuationFunction = investmentPortfolioValuationFunction;
    }

    public org.museframework.bian.etradingworkbench.dto.bq.InvestmentPortfolioValuationFunction getInvestmentPortfolioValuationFunction() {
        return investmentPortfolioValuationFunction;
    }
}