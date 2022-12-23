package org.museframework.bian.productmatching.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProductEligibilityRequest {
    @MetaField
    private String productmatchingid;

    @MetaField
    private String producteligibilityid;

    public void setProductmatchingid(String productmatchingid) {
        this.productmatchingid = productmatchingid;
    }

    public String getProductmatchingid() {
        return productmatchingid;
    }

    public void setProducteligibilityid(String producteligibilityid) {
        this.producteligibilityid = producteligibilityid;
    }

    public String getProducteligibilityid() {
        return producteligibilityid;
    }
}