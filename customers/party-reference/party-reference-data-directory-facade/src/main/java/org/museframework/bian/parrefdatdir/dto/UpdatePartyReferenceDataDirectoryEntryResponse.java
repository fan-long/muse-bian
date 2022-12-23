package org.museframework.bian.parrefdatdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdatePartyReferenceDataDirectoryEntryResponse {
    @MetaField(ref=true)
    private org.museframework.bian.parrefdatdir.dto.cr.PartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry;

    public void setPartyReferenceDataDirectoryEntry(org.museframework.bian.parrefdatdir.dto.cr.PartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry) {
        this.partyReferenceDataDirectoryEntry = partyReferenceDataDirectoryEntry;
    }

    public org.museframework.bian.parrefdatdir.dto.cr.PartyReferenceDataDirectoryEntry getPartyReferenceDataDirectoryEntry() {
        return partyReferenceDataDirectoryEntry;
    }
}