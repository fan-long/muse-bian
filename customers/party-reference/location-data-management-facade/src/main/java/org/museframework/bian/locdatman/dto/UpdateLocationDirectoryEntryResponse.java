package org.museframework.bian.locdatman.dto;

public class UpdateLocationDirectoryEntryResponse {
    private org.museframework.bian.locdatman.dto.cr.LocationDirectoryEntry locationDirectoryEntry;

    public void setLocationDirectoryEntry(org.museframework.bian.locdatman.dto.cr.LocationDirectoryEntry locationDirectoryEntry) {
        this.locationDirectoryEntry = locationDirectoryEntry;
    }

    public org.museframework.bian.locdatman.dto.cr.LocationDirectoryEntry getLocationDirectoryEntry() {
        return locationDirectoryEntry;
    }
}