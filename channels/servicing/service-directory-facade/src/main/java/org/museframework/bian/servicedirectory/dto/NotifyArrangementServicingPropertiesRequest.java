package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyArrangementServicingPropertiesRequest {
    @MetaField
    private String servicedirectoryid;

    @MetaField
    private String arrangementservicingpropertiesid;

    public void setServicedirectoryid(String servicedirectoryid) {
        this.servicedirectoryid = servicedirectoryid;
    }

    public String getServicedirectoryid() {
        return servicedirectoryid;
    }

    public void setArrangementservicingpropertiesid(String arrangementservicingpropertiesid) {
        this.arrangementservicingpropertiesid = arrangementservicingpropertiesid;
    }

    public String getArrangementservicingpropertiesid() {
        return arrangementservicingpropertiesid;
    }
}