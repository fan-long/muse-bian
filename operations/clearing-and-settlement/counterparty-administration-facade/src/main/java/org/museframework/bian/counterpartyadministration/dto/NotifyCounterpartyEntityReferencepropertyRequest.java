package org.museframework.bian.counterpartyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyCounterpartyEntityReferencepropertyRequest {
    @MetaField
    private String counterpartyadministrationid;

    @MetaField
    private String counterpartyentityreferencepropertyid;

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
}