package org.museframework.bian.legentdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveLegalEntityDirectoryEntryResponse {
    @MetaField(ref=true)
    private org.museframework.bian.legentdir.dto.cr.LegalEntityDirectoryEntry legalEntityDirectoryEntry;

    public void setLegalEntityDirectoryEntry(org.museframework.bian.legentdir.dto.cr.LegalEntityDirectoryEntry legalEntityDirectoryEntry) {
        this.legalEntityDirectoryEntry = legalEntityDirectoryEntry;
    }

    public org.museframework.bian.legentdir.dto.cr.LegalEntityDirectoryEntry getLegalEntityDirectoryEntry() {
        return legalEntityDirectoryEntry;
    }
}