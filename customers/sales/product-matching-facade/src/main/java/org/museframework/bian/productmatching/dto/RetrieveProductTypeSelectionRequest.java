package org.museframework.bian.productmatching.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProductTypeSelectionRequest {
    @MetaField
    private String productmatchingid;

    @MetaField
    private String producttypeselectionid;

    public void setProductmatchingid(String productmatchingid) {
        this.productmatchingid = productmatchingid;
    }

    public String getProductmatchingid() {
        return productmatchingid;
    }

    public void setProducttypeselectionid(String producttypeselectionid) {
        this.producttypeselectionid = producttypeselectionid;
    }

    public String getProducttypeselectionid() {
        return producttypeselectionid;
    }
}