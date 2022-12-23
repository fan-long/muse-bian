package org.museframework.bian.quotemanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyMarketQuoteRequestWorkstepRequest {
    @MetaField
    private String quotemanagementid;

    @MetaField
    private String marketquoterequestworkstepid;

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
}