package org.museframework.bian.cardcollections.dto;

public class RetrieveAssignmentResponse {
    private org.museframework.bian.cardcollections.dto.bq.Assignment assignment;

    public void setAssignment(org.museframework.bian.cardcollections.dto.bq.Assignment assignment) {
        this.assignment = assignment;
    }

    public org.museframework.bian.cardcollections.dto.bq.Assignment getAssignment() {
        return assignment;
    }
}