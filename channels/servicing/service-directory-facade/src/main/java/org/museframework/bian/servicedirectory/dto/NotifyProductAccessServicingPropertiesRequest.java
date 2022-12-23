package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyProductAccessServicingPropertiesRequest {
    @MetaField
    private String servicedirectoryid;

    @MetaField
    private String productaccessservicingpropertiesid;

    public void setServicedirectoryid(String servicedirectoryid) {
        this.servicedirectoryid = servicedirectoryid;
    }

    public String getServicedirectoryid() {
        return servicedirectoryid;
    }

    public void setProductaccessservicingpropertiesid(String productaccessservicingpropertiesid) {
        this.productaccessservicingpropertiesid = productaccessservicingpropertiesid;
    }

    public String getProductaccessservicingpropertiesid() {
        return productaccessservicingpropertiesid;
    }
}