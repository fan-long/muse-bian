package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateQuestionAssignmentRequest {
    @MetaField
    private String issueddeviceadministrationid;

    @MetaField
    private String questionassignmentid;

    @MetaField(ref=true)
    private org.museframework.bian.issdevadm.dto.bq.QuestionAssignment questionAssignment;

    public void setIssueddeviceadministrationid(String issueddeviceadministrationid) {
        this.issueddeviceadministrationid = issueddeviceadministrationid;
    }

    public String getIssueddeviceadministrationid() {
        return issueddeviceadministrationid;
    }

    public void setQuestionassignmentid(String questionassignmentid) {
        this.questionassignmentid = questionassignmentid;
    }

    public String getQuestionassignmentid() {
        return questionassignmentid;
    }

    public void setQuestionAssignment(org.museframework.bian.issdevadm.dto.bq.QuestionAssignment questionAssignment) {
        this.questionAssignment = questionAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.QuestionAssignment getQuestionAssignment() {
        return questionAssignment;
    }
}