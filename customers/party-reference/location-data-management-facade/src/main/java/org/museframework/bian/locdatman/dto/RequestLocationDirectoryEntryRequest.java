package org.museframework.bian.locdatman.dto;

public class RequestLocationDirectoryEntryRequest {
    private String locationdatamanagementid;

    private org.museframework.bian.locdatman.dto.cr.LocationDirectoryEntry locationDirectoryEntry;

    public void setLocationdatamanagementid(String locationdatamanagementid) {
        this.locationdatamanagementid = locationdatamanagementid;
    }

    public String getLocationdatamanagementid() {
        return locationdatamanagementid;
    }

    public void setLocationDirectoryEntry(org.museframework.bian.locdatman.dto.cr.LocationDirectoryEntry locationDirectoryEntry) {
        this.locationDirectoryEntry = locationDirectoryEntry;
    }

    public org.museframework.bian.locdatman.dto.cr.LocationDirectoryEntry getLocationDirectoryEntry() {
        return locationDirectoryEntry;
    }
}