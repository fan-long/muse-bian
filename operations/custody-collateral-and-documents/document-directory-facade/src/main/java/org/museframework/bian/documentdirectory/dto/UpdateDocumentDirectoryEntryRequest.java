package org.museframework.bian.documentdirectory.dto;

public class UpdateDocumentDirectoryEntryRequest {
    private String documentdirectoryid;

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