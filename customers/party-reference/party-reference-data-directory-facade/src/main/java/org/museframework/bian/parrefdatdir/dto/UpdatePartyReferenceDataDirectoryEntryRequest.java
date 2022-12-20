package org.museframework.bian.parrefdatdir.dto;

public class UpdatePartyReferenceDataDirectoryEntryRequest {
    private String partyreferencedatadirectoryid;

    private org.museframework.bian.parrefdatdir.dto.cr.PartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry;

    public void setPartyreferencedatadirectoryid(String partyreferencedatadirectoryid) {
        this.partyreferencedatadirectoryid = partyreferencedatadirectoryid;
    }

    public String getPartyreferencedatadirectoryid() {
        return partyreferencedatadirectoryid;
    }

    public void setPartyReferenceDataDirectoryEntry(org.museframework.bian.parrefdatdir.dto.cr.PartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry) {
        this.partyReferenceDataDirectoryEntry = partyReferenceDataDirectoryEntry;
    }

    public org.museframework.bian.parrefdatdir.dto.cr.PartyReferenceDataDirectoryEntry getPartyReferenceDataDirectoryEntry() {
        return partyReferenceDataDirectoryEntry;
    }
}