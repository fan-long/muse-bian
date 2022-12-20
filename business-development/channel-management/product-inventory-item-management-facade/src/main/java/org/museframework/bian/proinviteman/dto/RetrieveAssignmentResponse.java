package org.museframework.bian.proinviteman.dto;

public class RetrieveAssignmentResponse {
    private org.museframework.bian.proinviteman.dto.bq.Assignment assignment;

    public void setAssignment(org.museframework.bian.proinviteman.dto.bq.Assignment assignment) {
        this.assignment = assignment;
    }

    public org.museframework.bian.proinviteman.dto.bq.Assignment getAssignment() {
        return assignment;
    }
}