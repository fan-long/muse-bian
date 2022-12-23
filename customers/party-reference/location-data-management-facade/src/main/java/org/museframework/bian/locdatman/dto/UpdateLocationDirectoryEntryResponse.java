package org.museframework.bian.locdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateLocationDirectoryEntryResponse {
    @MetaField(ref=true)
    private org.museframework.bian.locdatman.dto.cr.LocationDirectoryEntry locationDirectoryEntry;

    public void setLocationDirectoryEntry(org.museframework.bian.locdatman.dto.cr.LocationDirectoryEntry locationDirectoryEntry) {
        this.locationDirectoryEntry = locationDirectoryEntry;
    }

    public org.museframework.bian.locdatman.dto.cr.LocationDirectoryEntry getLocationDirectoryEntry() {
        return locationDirectoryEntry;
    }
}