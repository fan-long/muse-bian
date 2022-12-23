package org.museframework.bian.productmatching.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveProductTypeSelectionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productmatching.dto.bq.ProductTypeSelection productTypeSelection;

    public void setProductTypeSelection(org.museframework.bian.productmatching.dto.bq.ProductTypeSelection productTypeSelection) {
        this.productTypeSelection = productTypeSelection;
    }

    public org.museframework.bian.productmatching.dto.bq.ProductTypeSelection getProductTypeSelection() {
        return productTypeSelection;
    }
}