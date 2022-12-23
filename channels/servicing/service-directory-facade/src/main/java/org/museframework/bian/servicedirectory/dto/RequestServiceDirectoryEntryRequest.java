package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestServiceDirectoryEntryRequest {
    @MetaField
    private String servicedirectoryid;

    @MetaField(ref=true)
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