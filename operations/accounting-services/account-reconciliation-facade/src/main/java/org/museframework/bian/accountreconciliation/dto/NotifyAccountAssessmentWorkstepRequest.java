package org.museframework.bian.accountreconciliation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyAccountAssessmentWorkstepRequest {
    @MetaField
    private String accountreconciliationid;

    @MetaField
    private String accountassessmentworkstepid;

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
}