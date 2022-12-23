package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestArrangementServicingPropertiesRequest {
    @MetaField
    private String servicedirectoryid;

    @MetaField
    private String arrangementservicingpropertiesid;

    @MetaField(ref=true)
    private org.museframework.bian.servicedirectory.dto.bq.ArrangementServicingProperties arrangementServicingProperties;

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

    public void setArrangementServicingProperties(org.museframework.bian.servicedirectory.dto.bq.ArrangementServicingProperties arrangementServicingProperties) {
        this.arrangementServicingProperties = arrangementServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.ArrangementServicingProperties getArrangementServicingProperties() {
        return arrangementServicingProperties;
    }
}