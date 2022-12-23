package org.museframework.bian.traposope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateTradeQuoteandPricingFunctionRequest {
    @MetaField
    private String traderpositionoperationsid;

    @MetaField
    private String tradequoteandpricingfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.traposope.dto.bq.TradeQuoteandPricingFunction tradeQuoteandPricingFunction;

    public void setTraderpositionoperationsid(String traderpositionoperationsid) {
        this.traderpositionoperationsid = traderpositionoperationsid;
    }

    public String getTraderpositionoperationsid() {
        return traderpositionoperationsid;
    }

    public void setTradequoteandpricingfunctionid(String tradequoteandpricingfunctionid) {
        this.tradequoteandpricingfunctionid = tradequoteandpricingfunctionid;
    }

    public String getTradequoteandpricingfunctionid() {
        return tradequoteandpricingfunctionid;
    }

    public void setTradeQuoteandPricingFunction(org.museframework.bian.traposope.dto.bq.TradeQuoteandPricingFunction tradeQuoteandPricingFunction) {
        this.tradeQuoteandPricingFunction = tradeQuoteandPricingFunction;
    }

    public org.museframework.bian.traposope.dto.bq.TradeQuoteandPricingFunction getTradeQuoteandPricingFunction() {
        return tradeQuoteandPricingFunction;
    }
}