package org.museframework.bian.issdevadm.dto;

public class InitiateQuestionAssignmentResponse {
    private org.museframework.bian.issdevadm.dto.bq.QuestionAssignment questionAssignment;

    public void setQuestionAssignment(org.museframework.bian.issdevadm.dto.bq.QuestionAssignment questionAssignment) {
        this.questionAssignment = questionAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.QuestionAssignment getQuestionAssignment() {
        return questionAssignment;
    }
}