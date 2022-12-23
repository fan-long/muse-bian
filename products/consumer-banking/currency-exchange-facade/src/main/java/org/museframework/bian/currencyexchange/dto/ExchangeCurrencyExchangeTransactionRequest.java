package org.museframework.bian.currencyexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeCurrencyExchangeTransactionRequest {
    @MetaField
    private String currencyexchangeid;

    @MetaField(ref=true)
    private org.museframework.bian.currencyexchange.dto.cr.CurrencyExchangeTransaction currencyExchangeTransaction;

    public void setCurrencyexchangeid(String currencyexchangeid) {
        this.currencyexchangeid = currencyexchangeid;
    }

    public String getCurrencyexchangeid() {
        return currencyexchangeid;
    }

    public void setCurrencyExchangeTransaction(org.museframework.bian.currencyexchange.dto.cr.CurrencyExchangeTransaction currencyExchangeTransaction) {
        this.currencyExchangeTransaction = currencyExchangeTransaction;
    }

    public org.museframework.bian.currencyexchange.dto.cr.CurrencyExchangeTransaction getCurrencyExchangeTransaction() {
        return currencyExchangeTransaction;
    }
}