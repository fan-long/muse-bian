package org.museframework.bian.traconmat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveUnmatchedMarketTradeEscalationFunctionRequest {
    @MetaField
    private String tradeconfirmationmatchingid;

    @MetaField
    private String unmatchedmarkettradeescalationfunctionid;

    public void setTradeconfirmationmatchingid(String tradeconfirmationmatchingid) {
        this.tradeconfirmationmatchingid = tradeconfirmationmatchingid;
    }

    public String getTradeconfirmationmatchingid() {
        return tradeconfirmationmatchingid;
    }

    public void setUnmatchedmarkettradeescalationfunctionid(String unmatchedmarkettradeescalationfunctionid) {
        this.unmatchedmarkettradeescalationfunctionid = unmatchedmarkettradeescalationfunctionid;
    }

    public String getUnmatchedmarkettradeescalationfunctionid() {
        return unmatchedmarkettradeescalationfunctionid;
    }
}