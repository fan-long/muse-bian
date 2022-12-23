package org.museframework.bian.traconmat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestUnmatchedMarketTradeEscalationFunctionRequest {
    @MetaField
    private String tradeconfirmationmatchingid;

    @MetaField
    private String unmatchedmarkettradeescalationfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.traconmat.dto.bq.UnmatchedMarketTradeEscalationFunction unmatchedMarketTradeEscalationFunction;

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

    public void setUnmatchedMarketTradeEscalationFunction(org.museframework.bian.traconmat.dto.bq.UnmatchedMarketTradeEscalationFunction unmatchedMarketTradeEscalationFunction) {
        this.unmatchedMarketTradeEscalationFunction = unmatchedMarketTradeEscalationFunction;
    }

    public org.museframework.bian.traconmat.dto.bq.UnmatchedMarketTradeEscalationFunction getUnmatchedMarketTradeEscalationFunction() {
        return unmatchedMarketTradeEscalationFunction;
    }
}