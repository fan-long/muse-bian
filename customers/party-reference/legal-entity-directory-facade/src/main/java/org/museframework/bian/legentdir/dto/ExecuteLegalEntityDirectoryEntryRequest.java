package org.museframework.bian.legentdir.dto;

public class ExecuteLegalEntityDirectoryEntryRequest {
    private String legalentitydirectoryid;

    private org.museframework.bian.legentdir.dto.cr.LegalEntityDirectoryEntry legalEntityDirectoryEntry;

    public void setLegalentitydirectoryid(String legalentitydirectoryid) {
        this.legalentitydirectoryid = legalentitydirectoryid;
    }

    public String getLegalentitydirectoryid() {
        return legalentitydirectoryid;
    }

    public void setLegalEntityDirectoryEntry(org.museframework.bian.legentdir.dto.cr.LegalEntityDirectoryEntry legalEntityDirectoryEntry) {
        this.legalEntityDirectoryEntry = legalEntityDirectoryEntry;
    }

    public org.museframework.bian.legentdir.dto.cr.LegalEntityDirectoryEntry getLegalEntityDirectoryEntry() {
        return legalEntityDirectoryEntry;
    }
}