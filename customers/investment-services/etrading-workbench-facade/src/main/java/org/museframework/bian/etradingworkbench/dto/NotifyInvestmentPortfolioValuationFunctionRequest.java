package org.museframework.bian.etradingworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyInvestmentPortfolioValuationFunctionRequest {
    @MetaField
    private String etradingworkbenchid;

    @MetaField
    private String investmentportfoliovaluationfunctionid;

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
}