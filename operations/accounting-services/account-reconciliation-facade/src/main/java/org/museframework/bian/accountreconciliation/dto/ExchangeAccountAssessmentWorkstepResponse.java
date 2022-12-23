package org.museframework.bian.accountreconciliation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeAccountAssessmentWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.accountreconciliation.dto.bq.AccountAssessmentWorkstep accountAssessmentWorkstep;

    public void setAccountAssessmentWorkstep(org.museframework.bian.accountreconciliation.dto.bq.AccountAssessmentWorkstep accountAssessmentWorkstep) {
        this.accountAssessmentWorkstep = accountAssessmentWorkstep;
    }

    public org.museframework.bian.accountreconciliation.dto.bq.AccountAssessmentWorkstep getAccountAssessmentWorkstep() {
        return accountAssessmentWorkstep;
    }
}