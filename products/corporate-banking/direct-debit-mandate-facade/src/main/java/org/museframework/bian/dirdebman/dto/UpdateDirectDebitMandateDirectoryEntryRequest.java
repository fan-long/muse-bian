package org.museframework.bian.dirdebman.dto;

public class UpdateDirectDebitMandateDirectoryEntryRequest {
    private String directdebitmandateid;

    private org.museframework.bian.dirdebman.dto.cr.DirectDebitMandateDirectoryEntry directDebitMandateDirectoryEntry;

    public void setDirectdebitmandateid(String directdebitmandateid) {
        this.directdebitmandateid = directdebitmandateid;
    }

    public String getDirectdebitmandateid() {
        return directdebitmandateid;
    }

    public void setDirectDebitMandateDirectoryEntry(org.museframework.bian.dirdebman.dto.cr.DirectDebitMandateDirectoryEntry directDebitMandateDirectoryEntry) {
        this.directDebitMandateDirectoryEntry = directDebitMandateDirectoryEntry;
    }

    public org.museframework.bian.dirdebman.dto.cr.DirectDebitMandateDirectoryEntry getDirectDebitMandateDirectoryEntry() {
        return directDebitMandateDirectoryEntry;
    }
}