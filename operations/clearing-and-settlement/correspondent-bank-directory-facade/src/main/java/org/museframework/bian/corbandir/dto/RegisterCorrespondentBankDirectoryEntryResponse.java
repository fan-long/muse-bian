package org.museframework.bian.corbandir.dto;

public class RegisterCorrespondentBankDirectoryEntryResponse {
    private org.museframework.bian.corbandir.dto.cr.CorrespondentBankDirectoryEntry correspondentBankDirectoryEntry;

    public void setCorrespondentBankDirectoryEntry(org.museframework.bian.corbandir.dto.cr.CorrespondentBankDirectoryEntry correspondentBankDirectoryEntry) {
        this.correspondentBankDirectoryEntry = correspondentBankDirectoryEntry;
    }

    public org.museframework.bian.corbandir.dto.cr.CorrespondentBankDirectoryEntry getCorrespondentBankDirectoryEntry() {
        return correspondentBankDirectoryEntry;
    }
}