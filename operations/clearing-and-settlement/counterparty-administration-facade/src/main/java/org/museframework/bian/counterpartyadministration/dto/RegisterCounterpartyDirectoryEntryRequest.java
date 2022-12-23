package org.museframework.bian.counterpartyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RegisterCounterpartyDirectoryEntryRequest {
    @MetaField(ref=true)
    private org.museframework.bian.counterpartyadministration.dto.cr.CounterpartyDirectoryEntry counterpartyDirectoryEntry;

    public void setCounterpartyDirectoryEntry(org.museframework.bian.counterpartyadministration.dto.cr.CounterpartyDirectoryEntry counterpartyDirectoryEntry) {
        this.counterpartyDirectoryEntry = counterpartyDirectoryEntry;
    }

    public org.museframework.bian.counterpartyadministration.dto.cr.CounterpartyDirectoryEntry getCounterpartyDirectoryEntry() {
        return counterpartyDirectoryEntry;
    }
}