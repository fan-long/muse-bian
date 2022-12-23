package org.museframework.bian.accountrecovery.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAssessmentRequest {
    @MetaField
    private String accountrecoveryid;

    @MetaField
    private String assessmentid;

    @MetaField(ref=true)
    private org.museframework.bian.accountrecovery.dto.bq.Assessment assessment;

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

    public void setAssessment(org.museframework.bian.accountrecovery.dto.bq.Assessment assessment) {
        this.assessment = assessment;
    }

    public org.museframework.bian.accountrecovery.dto.bq.Assessment getAssessment() {
        return assessment;
    }
}