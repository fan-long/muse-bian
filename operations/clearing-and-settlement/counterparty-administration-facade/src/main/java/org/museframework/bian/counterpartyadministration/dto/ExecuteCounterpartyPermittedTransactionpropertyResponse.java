package org.museframework.bian.counterpartyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteCounterpartyPermittedTransactionpropertyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyPermittedTransactionproperty counterpartyPermittedTransactionproperty;

    public void setCounterpartyPermittedTransactionproperty(org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyPermittedTransactionproperty counterpartyPermittedTransactionproperty) {
        this.counterpartyPermittedTransactionproperty = counterpartyPermittedTransactionproperty;
    }

    public org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyPermittedTransactionproperty getCounterpartyPermittedTransactionproperty() {
        return counterpartyPermittedTransactionproperty;
    }
}