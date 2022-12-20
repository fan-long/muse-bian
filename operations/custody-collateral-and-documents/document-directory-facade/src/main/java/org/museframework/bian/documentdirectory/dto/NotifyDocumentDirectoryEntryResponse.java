package org.museframework.bian.documentdirectory.dto;

public class NotifyDocumentDirectoryEntryResponse {
    private org.museframework.bian.documentdirectory.dto.cr.DocumentDirectoryEntry documentDirectoryEntry;

    public void setDocumentDirectoryEntry(org.museframework.bian.documentdirectory.dto.cr.DocumentDirectoryEntry documentDirectoryEntry) {
        this.documentDirectoryEntry = documentDirectoryEntry;
    }

    public org.museframework.bian.documentdirectory.dto.cr.DocumentDirectoryEntry getDocumentDirectoryEntry() {
        return documentDirectoryEntry;
    }
}