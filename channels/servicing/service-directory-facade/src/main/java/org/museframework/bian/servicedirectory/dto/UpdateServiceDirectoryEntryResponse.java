package org.museframework.bian.servicedirectory.dto;

public class UpdateServiceDirectoryEntryResponse {
    private org.museframework.bian.servicedirectory.dto.cr.ServiceDirectoryEntry serviceDirectoryEntry;

    public void setServiceDirectoryEntry(org.museframework.bian.servicedirectory.dto.cr.ServiceDirectoryEntry serviceDirectoryEntry) {
        this.serviceDirectoryEntry = serviceDirectoryEntry;
    }

    public org.museframework.bian.servicedirectory.dto.cr.ServiceDirectoryEntry getServiceDirectoryEntry() {
        return serviceDirectoryEntry;
    }
}