package org.museframework.bian.productmatching.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateProductEligibilityRequest {
    @MetaField
    private String productmatchingid;

    @MetaField
    private String producteligibilityid;

    @MetaField(ref=true)
    private org.museframework.bian.productmatching.dto.bq.ProductEligibility productEligibility;

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

    public void setProductEligibility(org.museframework.bian.productmatching.dto.bq.ProductEligibility productEligibility) {
        this.productEligibility = productEligibility;
    }

    public org.museframework.bian.productmatching.dto.bq.ProductEligibility getProductEligibility() {
        return productEligibility;
    }
}