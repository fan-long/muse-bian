package org.museframework.bian.currencyexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ControlCurrencyExchangeTransactionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.currencyexchange.dto.cr.CurrencyExchangeTransaction currencyExchangeTransaction;

    public void setCurrencyExchangeTransaction(org.museframework.bian.currencyexchange.dto.cr.CurrencyExchangeTransaction currencyExchangeTransaction) {
        this.currencyExchangeTransaction = currencyExchangeTransaction;
    }

    public org.museframework.bian.currencyexchange.dto.cr.CurrencyExchangeTransaction getCurrencyExchangeTransaction() {
        return currencyExchangeTransaction;
    }
}