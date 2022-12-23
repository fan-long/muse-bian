package org.museframework.bian.invporman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateTradeInitiationRequest {
    @MetaField
    private String investmentportfoliomanagementid;

    @MetaField
    private String tradeinitiationid;

    @MetaField(ref=true)
    private org.museframework.bian.invporman.dto.bq.TradeInitiation tradeInitiation;

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

    public void setTradeInitiation(org.museframework.bian.invporman.dto.bq.TradeInitiation tradeInitiation) {
        this.tradeInitiation = tradeInitiation;
    }

    public org.museframework.bian.invporman.dto.bq.TradeInitiation getTradeInitiation() {
        return tradeInitiation;
    }
}