package org.museframework.bian.invporman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTradeInitiationRequest {
    @MetaField
    private String investmentportfoliomanagementid;

    @MetaField
    private String tradeinitiationid;

    public void setInvestmentportfoliomanagementid(String investmentportfoliomanagementid) {
        this.investmentportfoliomanagementid = investmentportfoliomanagementid;
    }

    public String getInvestmentportfoliomanagementid() {
        return investmentportfoliomanagementid;
    }

    public void setTradeinitiationid(String tradeinitiationid) {
        this.tradeinitiationid = tradeinitiationid;
    }

    public String getTradeinitiationid() {
        return tradeinitiationid;
    }
}