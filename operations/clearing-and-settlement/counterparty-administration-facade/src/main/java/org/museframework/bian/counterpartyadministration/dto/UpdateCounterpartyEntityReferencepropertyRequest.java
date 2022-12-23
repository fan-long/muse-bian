package org.museframework.bian.counterpartyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCounterpartyEntityReferencepropertyRequest {
    @MetaField
    private String counterpartyadministrationid;

    @MetaField
    private String counterpartyentityreferencepropertyid;

    @MetaField(ref=true)
    private org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyEntityReferenceproperty counterpartyEntityReferenceproperty;

    public void setCounterpartyadministrationid(String counterpartyadministrationid) {
        this.counterpartyadministrationid = counterpartyadministrationid;
    }

    public String getCounterpartyadministrationid() {
        return counterpartyadministrationid;
    }

    public void setCounterpartyentityreferencepropertyid(String counterpartyentityreferencepropertyid) {
        this.counterpartyentityreferencepropertyid = counterpartyentityreferencepropertyid;
    }

    public String getCounterpartyentityreferencepropertyid() {
        return counterpartyentityreferencepropertyid;
    }

    public void setCounterpartyEntityReferenceproperty(org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyEntityReferenceproperty counterpartyEntityReferenceproperty) {
        this.counterpartyEntityReferenceproperty = counterpartyEntityReferenceproperty;
    }

    public org.museframework.bian.counterpartyadministration.dto.bq.CounterpartyEntityReferenceproperty getCounterpartyEntityReferenceproperty() {
        return counterpartyEntityReferenceproperty;
    }
}