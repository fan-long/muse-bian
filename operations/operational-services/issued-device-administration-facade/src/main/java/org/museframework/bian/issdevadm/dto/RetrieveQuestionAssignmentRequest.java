package org.museframework.bian.issdevadm.dto;

public class RetrieveQuestionAssignmentRequest {
    private String issueddeviceadministrationid;

    private String questionassignmentid;

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
}