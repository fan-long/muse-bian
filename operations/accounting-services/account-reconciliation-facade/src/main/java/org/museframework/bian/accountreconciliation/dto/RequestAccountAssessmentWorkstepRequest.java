package org.museframework.bian.accountreconciliation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestAccountAssessmentWorkstepRequest {
    @MetaField
    private String accountreconciliationid;

    @MetaField
    private String accountassessmentworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.accountreconciliation.dto.bq.AccountAssessmentWorkstep accountAssessmentWorkstep;

    public void setAccountreconciliationid(String accountreconciliationid) {
        this.accountreconciliationid = accountreconciliationid;
    }

    public String getAccountreconciliationid() {
        return accountreconciliationid;
    }

    public void setAccountassessmentworkstepid(String accountassessmentworkstepid) {
        this.accountassessmentworkstepid = accountassessmentworkstepid;
    }

    public String getAccountassessmentworkstepid() {
        return accountassessmentworkstepid;
    }

    public void setAccountAssessmentWorkstep(org.museframework.bian.accountreconciliation.dto.bq.AccountAssessmentWorkstep accountAssessmentWorkstep) {
        this.accountAssessmentWorkstep = accountAssessmentWorkstep;
    }

    public org.museframework.bian.accountreconciliation.dto.bq.AccountAssessmentWorkstep getAccountAssessmentWorkstep() {
        return accountAssessmentWorkstep;
    }
}