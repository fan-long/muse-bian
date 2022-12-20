package org.museframework.bian.issdevadm.dto;

public class UpdateQuestionAssignmentRequest {
    private String issueddeviceadministrationid;

    private String questionassignmentid;

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