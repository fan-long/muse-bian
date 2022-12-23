package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyDocumentDirectoryEntryResponse {
    @MetaField(ref=true)
    private org.museframework.bian.documentdirectory.dto.cr.DocumentDirectoryEntry documentDirectoryEntry;

    public void setDocumentDirectoryEntry(org.museframework.bian.documentdirectory.dto.cr.DocumentDirectoryEntry documentDirectoryEntry) {
        this.documentDirectoryEntry = documentDirectoryEntry;
    }

    public org.museframework.bian.documentdirectory.dto.cr.DocumentDirectoryEntry getDocumentDirectoryEntry() {
        return documentDirectoryEntry;
    }
}