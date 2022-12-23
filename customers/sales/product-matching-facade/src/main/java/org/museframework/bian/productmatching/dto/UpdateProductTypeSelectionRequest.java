package org.museframework.bian.productmatching.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateProductTypeSelectionRequest {
    @MetaField
    private String productmatchingid;

    @MetaField
    private String producttypeselectionid;

    @MetaField(ref=true)
    private org.museframework.bian.productmatching.dto.bq.ProductTypeSelection productTypeSelection;

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

    public void setProductTypeSelection(org.museframework.bian.productmatching.dto.bq.ProductTypeSelection productTypeSelection) {
        this.productTypeSelection = productTypeSelection;
    }

    public org.museframework.bian.productmatching.dto.bq.ProductTypeSelection getProductTypeSelection() {
        return productTypeSelection;
    }
}