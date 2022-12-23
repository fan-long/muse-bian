package org.museframework.bian.currencyexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateFXTransactionPricingRequest {
    @MetaField
    private String currencyexchangeid;

    @MetaField
    private String fxtransactionpricingid;

    @MetaField(ref=true)
    private org.museframework.bian.currencyexchange.dto.bq.FXTransactionPricing fXTransactionPricing;

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

    public void setfXTransactionPricing(org.museframework.bian.currencyexchange.dto.bq.FXTransactionPricing fXTransactionPricing) {
        this.fXTransactionPricing = fXTransactionPricing;
    }

    public org.museframework.bian.currencyexchange.dto.bq.FXTransactionPricing getfXTransactionPricing() {
        return fXTransactionPricing;
    }
}