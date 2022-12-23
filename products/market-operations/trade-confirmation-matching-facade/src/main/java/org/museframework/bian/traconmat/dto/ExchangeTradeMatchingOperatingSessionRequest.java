package org.museframework.bian.traconmat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeTradeMatchingOperatingSessionRequest {
    @MetaField
    private String tradeconfirmationmatchingid;

    @MetaField(ref=true)
    private org.museframework.bian.traconmat.dto.cr.TradeMatchingOperatingSession tradeMatchingOperatingSession;

    public void setTradeconfirmationmatchingid(String tradeconfirmationmatchingid) {
        this.tradeconfirmationmatchingid = tradeconfirmationmatchingid;
    }

    public String getTradeconfirmationmatchingid() {
        return tradeconfirmationmatchingid;
    }

    public void setTradeMatchingOperatingSession(org.museframework.bian.traconmat.dto.cr.TradeMatchingOperatingSession tradeMatchingOperatingSession) {
        this.tradeMatchingOperatingSession = tradeMatchingOperatingSession;
    }

    public org.museframework.bian.traconmat.dto.cr.TradeMatchingOperatingSession getTradeMatchingOperatingSession() {
        return tradeMatchingOperatingSession;
    }
}