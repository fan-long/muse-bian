package org.museframework.bian.servicedirectory.dto;

public class ControlServiceDirectoryEntryRequest {
    private String servicedirectoryid;

    private org.museframework.bian.servicedirectory.dto.cr.ServiceDirectoryEntry serviceDirectoryEntry;

    public void setServicedirectoryid(String servicedirectoryid) {
        this.servicedirectoryid = servicedirectoryid;
    }

    public String getServicedirectoryid() {
        return servicedirectoryid;
    }

    public void setServiceDirectoryEntry(org.museframework.bian.servicedirectory.dto.cr.ServiceDirectoryEntry serviceDirectoryEntry) {
        this.serviceDirectoryEntry = serviceDirectoryEntry;
    }

    public org.museframework.bian.servicedirectory.dto.cr.ServiceDirectoryEntry getServiceDirectoryEntry() {
        return serviceDirectoryEntry;
    }
}