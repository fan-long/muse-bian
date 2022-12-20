package org.museframework.bian.currencyexchange.dto;

public class RetrieveFXTransactionPricingResponse {
    private org.museframework.bian.currencyexchange.dto.bq.FXTransactionPricing fXTransactionPricing;

    public void setfXTransactionPricing(org.museframework.bian.currencyexchange.dto.bq.FXTransactionPricing fXTransactionPricing) {
        this.fXTransactionPricing = fXTransactionPricing;
    }

    public org.museframework.bian.currencyexchange.dto.bq.FXTransactionPricing getfXTransactionPricing() {
        return fXTransactionPricing;
    }
}