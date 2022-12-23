package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RegisterProductAccessServicingPropertiesRequest {
    @MetaField
    private String servicedirectoryid;

    @MetaField
    private String productaccessservicingpropertiesid;

    @MetaField(ref=true)
    private org.museframework.bian.servicedirectory.dto.bq.ProductAccessServicingProperties productAccessServicingProperties;

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

    public void setProductAccessServicingProperties(org.museframework.bian.servicedirectory.dto.bq.ProductAccessServicingProperties productAccessServicingProperties) {
        this.productAccessServicingProperties = productAccessServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.ProductAccessServicingProperties getProductAccessServicingProperties() {
        return productAccessServicingProperties;
    }
}