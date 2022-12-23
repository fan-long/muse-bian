package org.museframework.bian.locdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteLocationDirectoryEntryRequest {
    @MetaField
    private String locationdatamanagementid;

    @MetaField(ref=true)
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