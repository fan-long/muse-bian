package org.museframework.bian.salproagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrievePolicyTermsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.salproagr.dto.bq.PolicyTerms policyTerms;

    public void setPolicyTerms(org.museframework.bian.salproagr.dto.bq.PolicyTerms policyTerms) {
        this.policyTerms = policyTerms;
    }

    public org.museframework.bian.salproagr.dto.bq.PolicyTerms getPolicyTerms() {
        return policyTerms;
    }
}