package org.museframework.bian.probroagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class EvaluatePolicyTermsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.probroagr.dto.bq.PolicyTerms policyTerms;

    public void setPolicyTerms(org.museframework.bian.probroagr.dto.bq.PolicyTerms policyTerms) {
        this.policyTerms = policyTerms;
    }

    public org.museframework.bian.probroagr.dto.bq.PolicyTerms getPolicyTerms() {
        return policyTerms;
    }
}