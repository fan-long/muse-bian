package org.museframework.bian.traposope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTradeQuoteandPricingFunctionRequest {
    @MetaField
    private String traderpositionoperationsid;

    @MetaField
    private String tradequoteandpricingfunctionid;

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
}