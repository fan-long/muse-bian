package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteServiceDirectoryEntryResponse {
    @MetaField(ref=true)
    private org.museframework.bian.servicedirectory.dto.cr.ServiceDirectoryEntry serviceDirectoryEntry;

    public void setServiceDirectoryEntry(org.museframework.bian.servicedirectory.dto.cr.ServiceDirectoryEntry serviceDirectoryEntry) {
        this.serviceDirectoryEntry = serviceDirectoryEntry;
    }

    public org.museframework.bian.servicedirectory.dto.cr.ServiceDirectoryEntry getServiceDirectoryEntry() {
        return serviceDirectoryEntry;
    }
}