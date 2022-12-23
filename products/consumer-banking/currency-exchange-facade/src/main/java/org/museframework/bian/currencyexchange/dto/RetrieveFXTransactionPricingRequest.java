package org.museframework.bian.currencyexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFXTransactionPricingRequest {
    @MetaField
    private String currencyexchangeid;

    @MetaField
    private String fxtransactionpricingid;

    public void setCurrencyexchangeid(String currencyexchangeid) {
        this.currencyexchangeid = currencyexchangeid;
    }

    public String getCurrencyexchangeid() {
        return currencyexchangeid;
    }

    public void setFxtransactionpricingid(String fxtransactionpricingid) {
        this.fxtransactionpricingid = fxtransactionpricingid;
    }

    public String getFxtransactionpricingid() {
        return fxtransactionpricingid;
    }
}