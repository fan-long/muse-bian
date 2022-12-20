package org.museframework.bian.corbandir.dto;

public class RequestCorrespondentBankDirectoryEntryRequest {
    private String correspondentbankdirectoryid;

    private org.museframework.bian.corbandir.dto.cr.CorrespondentBankDirectoryEntry correspondentBankDirectoryEntry;

    public void setCorrespondentbankdirectoryid(String correspondentbankdirectoryid) {
        this.correspondentbankdirectoryid = correspondentbankdirectoryid;
    }

    public String getCorrespondentbankdirectoryid() {
        return correspondentbankdirectoryid;
    }

    public void setCorrespondentBankDirectoryEntry(org.museframework.bian.corbandir.dto.cr.CorrespondentBankDirectoryEntry correspondentBankDirectoryEntry) {
        this.correspondentBankDirectoryEntry = correspondentBankDirectoryEntry;
    }

    public org.museframework.bian.corbandir.dto.cr.CorrespondentBankDirectoryEntry getCorrespondentBankDirectoryEntry() {
        return correspondentBankDirectoryEntry;
    }
}