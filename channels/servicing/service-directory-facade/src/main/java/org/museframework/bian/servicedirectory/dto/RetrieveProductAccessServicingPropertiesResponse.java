package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveProductAccessServicingPropertiesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.servicedirectory.dto.bq.ProductAccessServicingProperties productAccessServicingProperties;

    public void setProductAccessServicingProperties(org.museframework.bian.servicedirectory.dto.bq.ProductAccessServicingProperties productAccessServicingProperties) {
        this.productAccessServicingProperties = productAccessServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.ProductAccessServicingProperties getProductAccessServicingProperties() {
        return productAccessServicingProperties;
    }
}