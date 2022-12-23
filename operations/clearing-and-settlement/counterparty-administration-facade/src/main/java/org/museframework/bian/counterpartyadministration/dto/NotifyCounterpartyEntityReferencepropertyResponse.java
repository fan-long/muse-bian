package org.museframework.bian.counterpartyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyCounterpartyEntityReferencepropertyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyEntityReferenceproperty counterpartyEntityReferenceproperty;

    public void setCounterpartyEntityReferenceproperty(org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyEntityReferenceproperty counterpartyEntityReferenceproperty) {
        this.counterpartyEntityReferenceproperty = counterpartyEntityReferenceproperty;
    }

    public org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyEntityReferenceproperty getCounterpartyEntityReferenceproperty() {
        return counterpartyEntityReferenceproperty;
    }
}