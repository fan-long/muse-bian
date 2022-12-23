package org.museframework.bian.subcusagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrievePolicyTermResponse {
    @MetaField(ref=true)
    private org.museframework.bian.subcusagr.dto.bq.PolicyTerm policyTerm;

    public void setPolicyTerm(org.museframework.bian.subcusagr.dto.bq.PolicyTerm policyTerm) {
        this.policyTerm = policyTerm;
    }

    public org.museframework.bian.subcusagr.dto.bq.PolicyTerm getPolicyTerm() {
        return policyTerm;
    }
}