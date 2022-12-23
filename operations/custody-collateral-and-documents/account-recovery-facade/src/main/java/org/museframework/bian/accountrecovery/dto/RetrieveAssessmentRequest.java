package org.museframework.bian.accountrecovery.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAssessmentRequest {
    @MetaField
    private String accountrecoveryid;

    @MetaField
    private String assessmentid;

    public void setAccountrecoveryid(String accountrecoveryid) {
        this.accountrecoveryid = accountrecoveryid;
    }

    public String getAccountrecoveryid() {
        return accountrecoveryid;
    }

    public void setAssessmentid(String assessmentid) {
        this.assessmentid = assessmentid;
    }

    public String getAssessmentid() {
        return assessmentid;
    }
}