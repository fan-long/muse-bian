package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestSalesServicingPropertiesRequest {
    @MetaField
    private String servicedirectoryid;

    @MetaField
    private String salesservicingpropertiesid;

    @MetaField(ref=true)
    private org.museframework.bian.servicedirectory.dto.bq.SalesServicingProperties salesServicingProperties;

    public void setServicedirectoryid(String servicedirectoryid) {
        this.servicedirectoryid = servicedirectoryid;
    }

    public String getServicedirectoryid() {
        return servicedirectoryid;
    }

    public void setSalesservicingpropertiesid(String salesservicingpropertiesid) {
        this.salesservicingpropertiesid = salesservicingpropertiesid;
    }

    public String getSalesservicingpropertiesid() {
        return salesservicingpropertiesid;
    }

    public void setSalesServicingProperties(org.museframework.bian.servicedirectory.dto.bq.SalesServicingProperties salesServicingProperties) {
        this.salesServicingProperties = salesServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.SalesServicingProperties getSalesServicingProperties() {
        return salesServicingProperties;
    }
}