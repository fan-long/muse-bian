package org.museframework.bian.spepricon.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdatePricingTermsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.spepricon.dto.bq.PricingTerms pricingTerms;

    public void setPricingTerms(org.museframework.bian.spepricon.dto.bq.PricingTerms pricingTerms) {
        this.pricingTerms = pricingTerms;
    }

    public org.museframework.bian.spepricon.dto.bq.PricingTerms getPricingTerms() {
        return pricingTerms;
    }
}