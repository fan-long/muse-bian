package org.museframework.bian.customeragreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdatePolicyTermsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customeragreement.dto.bq.PolicyTerms policyTerms;

    public void setPolicyTerms(org.museframework.bian.customeragreement.dto.bq.PolicyTerms policyTerms) {
        this.policyTerms = policyTerms;
    }

    public org.museframework.bian.customeragreement.dto.bq.PolicyTerms getPolicyTerms() {
        return policyTerms;
    }
}