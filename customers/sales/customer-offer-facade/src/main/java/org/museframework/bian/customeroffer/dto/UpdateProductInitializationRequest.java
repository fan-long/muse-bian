package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateProductInitializationRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String productinitializationid;

    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.ProductInitialization productInitialization;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setProductinitializationid(String productinitializationid) {
        this.productinitializationid = productinitializationid;
    }

    public String getProductinitializationid() {
        return productinitializationid;
    }

    public void setProductInitialization(org.museframework.bian.customeroffer.dto.bq.ProductInitialization productInitialization) {
        this.productInitialization = productInitialization;
    }

    public org.museframework.bian.customeroffer.dto.bq.ProductInitialization getProductInitialization() {
        return productInitialization;
    }
}