package org.museframework.bian.quotemanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateMarketQuoteRequestWorkstepRequest {
    @MetaField
    private String quotemanagementid;

    @MetaField
    private String marketquoterequestworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.quotemanagement.dto.bq.MarketQuoteRequestWorkstep marketQuoteRequestWorkstep;

    public void setQuotemanagementid(String quotemanagementid) {
        this.quotemanagementid = quotemanagementid;
    }

    public String getQuotemanagementid() {
        return quotemanagementid;
    }

    public void setMarketquoterequestworkstepid(String marketquoterequestworkstepid) {
        this.marketquoterequestworkstepid = marketquoterequestworkstepid;
    }

    public String getMarketquoterequestworkstepid() {
        return marketquoterequestworkstepid;
    }

    public void setMarketQuoteRequestWorkstep(org.museframework.bian.quotemanagement.dto.bq.MarketQuoteRequestWorkstep marketQuoteRequestWorkstep) {
        this.marketQuoteRequestWorkstep = marketQuoteRequestWorkstep;
    }

    public org.museframework.bian.quotemanagement.dto.bq.MarketQuoteRequestWorkstep getMarketQuoteRequestWorkstep() {
        return marketQuoteRequestWorkstep;
    }
}