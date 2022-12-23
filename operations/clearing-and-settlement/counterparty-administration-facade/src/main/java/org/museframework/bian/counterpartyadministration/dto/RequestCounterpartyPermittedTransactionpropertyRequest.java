package org.museframework.bian.counterpartyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestCounterpartyPermittedTransactionpropertyRequest {
    @MetaField
    private String counterpartyadministrationid;

    @MetaField
    private String counterpartypermittedtransactionpropertyid;

    @MetaField(ref=true)
    private org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyPermittedTransactionproperty counterpartyPermittedTransactionproperty;

    public void setCounterpartyadministrationid(String counterpartyadministrationid) {
        this.counterpartyadministrationid = counterpartyadministrationid;
    }

    public String getCounterpartyadministrationid() {
        return counterpartyadministrationid;
    }

    public void setCounterpartypermittedtransactionpropertyid(String counterpartypermittedtransactionpropertyid) {
        this.counterpartypermittedtransactionpropertyid = counterpartypermittedtransactionpropertyid;
    }

    public String getCounterpartypermittedtransactionpropertyid() {
        return counterpartypermittedtransactionpropertyid;
    }

    public void setCounterpartyPermittedTransactionproperty(org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyPermittedTransactionproperty counterpartyPermittedTransactionproperty) {
        this.counterpartyPermittedTransactionproperty = counterpartyPermittedTransactionproperty;
    }

    public org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyPermittedTransactionproperty getCounterpartyPermittedTransactionproperty() {
        return counterpartyPermittedTransactionproperty;
    }
}