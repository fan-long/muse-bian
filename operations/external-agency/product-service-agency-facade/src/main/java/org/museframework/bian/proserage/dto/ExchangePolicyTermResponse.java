package org.museframework.bian.proserage.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangePolicyTermResponse {
    @MetaField(ref=true)
    private org.museframework.bian.proserage.dto.bq.PolicyTerm policyTerm;

    public void setPolicyTerm(org.museframework.bian.proserage.dto.bq.PolicyTerm policyTerm) {
        this.policyTerm = policyTerm;
    }

    public org.museframework.bian.proserage.dto.bq.PolicyTerm getPolicyTerm() {
        return policyTerm;
    }
}