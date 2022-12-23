package org.museframework.bian.conandsupagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdatePolicyTermResponse {
    @MetaField(ref=true)
    private org.museframework.bian.conandsupagr.dto.bq.PolicyTerm policyTerm;

    public void setPolicyTerm(org.museframework.bian.conandsupagr.dto.bq.PolicyTerm policyTerm) {
        this.policyTerm = policyTerm;
    }

    public org.museframework.bian.conandsupagr.dto.bq.PolicyTerm getPolicyTerm() {
        return policyTerm;
    }
}