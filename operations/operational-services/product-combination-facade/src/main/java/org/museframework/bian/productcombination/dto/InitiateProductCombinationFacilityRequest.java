package org.museframework.bian.productcombination.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateProductCombinationFacilityRequest {
    @MetaField(ref=true)
    private org.museframework.bian.productcombination.dto.cr.ProductCombinationFacility productCombinationFacility;

    public void setProductCombinationFacility(org.museframework.bian.productcombination.dto.cr.ProductCombinationFacility productCombinationFacility) {
        this.productCombinationFacility = productCombinationFacility;
    }

    public org.museframework.bian.productcombination.dto.cr.ProductCombinationFacility getProductCombinationFacility() {
        return productCombinationFacility;
    }
}