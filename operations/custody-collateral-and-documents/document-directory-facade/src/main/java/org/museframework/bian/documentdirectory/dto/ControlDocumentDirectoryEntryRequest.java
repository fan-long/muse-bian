package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ControlDocumentDirectoryEntryRequest {
    @MetaField
    private String documentdirectoryid;

    @MetaField(ref=true)
    private org.museframework.bian.documentdirectory.dto.cr.DocumentDirectoryEntry documentDirectoryEntry;

    public void setDocumentdirectoryid(String documentdirectoryid) {
        this.documentdirectoryid = documentdirectoryid;
    }

    public String getDocumentdirectoryid() {
        return documentdirectoryid;
    }

    public void setDocumentDirectoryEntry(org.museframework.bian.documentdirectory.dto.cr.DocumentDirectoryEntry documentDirectoryEntry) {
        this.documentDirectoryEntry = documentDirectoryEntry;
    }

    public org.museframework.bian.documentdirectory.dto.cr.DocumentDirectoryEntry getDocumentDirectoryEntry() {
        return documentDirectoryEntry;
    }
}