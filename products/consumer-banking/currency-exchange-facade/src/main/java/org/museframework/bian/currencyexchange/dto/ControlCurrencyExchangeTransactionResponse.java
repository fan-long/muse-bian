package org.museframework.bian.currencyexchange.dto;

public class ControlCurrencyExchangeTransactionResponse {
    private org.museframework.bian.currencyexchange.dto.cr.CurrencyExchangeTransaction currencyExchangeTransaction;

    public void setCurrencyExchangeTransaction(org.museframework.bian.currencyexchange.dto.cr.CurrencyExchangeTransaction currencyExchangeTransaction) {
        this.currencyExchangeTransaction = currencyExchangeTransaction;
    }

    public org.museframework.bian.currencyexchange.dto.cr.CurrencyExchangeTransaction getCurrencyExchangeTransaction() {
        return currencyExchangeTransaction;
    }
}