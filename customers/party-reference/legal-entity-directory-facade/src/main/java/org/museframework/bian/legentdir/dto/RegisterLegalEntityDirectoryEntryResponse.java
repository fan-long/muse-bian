package org.museframework.bian.legentdir.dto;

public class RegisterLegalEntityDirectoryEntryResponse {
    private org.museframework.bian.legentdir.dto.cr.LegalEntityDirectoryEntry legalEntityDirectoryEntry;

    public void setLegalEntityDirectoryEntry(org.museframework.bian.legentdir.dto.cr.LegalEntityDirectoryEntry legalEntityDirectoryEntry) {
        this.legalEntityDirectoryEntry = legalEntityDirectoryEntry;
    }

    public org.museframework.bian.legentdir.dto.cr.LegalEntityDirectoryEntry getLegalEntityDirectoryEntry() {
        return legalEntityDirectoryEntry;
    }
}