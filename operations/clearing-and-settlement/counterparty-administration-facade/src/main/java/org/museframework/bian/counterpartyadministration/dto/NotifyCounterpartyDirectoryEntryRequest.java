package org.museframework.bian.counterpartyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyCounterpartyDirectoryEntryRequest {
    @MetaField
    private String counterpartyadministrationid;

    public void setCounterpartyadministrationid(String counterpartyadministrationid) {
        this.counterpartyadministrationid = counterpartyadministrationid;
    }

    public String getCounterpartyadministrationid() {
        return counterpartyadministrationid;
    }
}