package org.museframework.bian.invporman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveMarketOpportunitiesRequest {
    @MetaField
    private String investmentportfoliomanagementid;

    @MetaField
    private String marketopportunitiesid;

    public void setInvestmentportfoliomanagementid(String investmentportfoliomanagementid) {
        this.investmentportfoliomanagementid = investmentportfoliomanagementid;
    }

    public String getInvestmentportfoliomanagementid() {
        return investmentportfoliomanagementid;
    }

    public void setMarketopportunitiesid(String marketopportunitiesid) {
        this.marketopportunitiesid = marketopportunitiesid;
    }

    public String getMarketopportunitiesid() {
        return marketopportunitiesid;
    }
}