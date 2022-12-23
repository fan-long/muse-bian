package org.museframework.bian.factoring.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeAccountsReceivablePurchaseFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.factoring.dto.bq.AccountsReceivablePurchaseFulfillment accountsReceivablePurchaseFulfillment;

    public void setAccountsReceivablePurchaseFulfillment(org.museframework.bian.factoring.dto.bq.AccountsReceivablePurchaseFulfillment accountsReceivablePurchaseFulfillment) {
        this.accountsReceivablePurchaseFulfillment = accountsReceivablePurchaseFulfillment;
    }

    public org.museframework.bian.factoring.dto.bq.AccountsReceivablePurchaseFulfillment getAccountsReceivablePurchaseFulfillment() {
        return accountsReceivablePurchaseFulfillment;
    }
}