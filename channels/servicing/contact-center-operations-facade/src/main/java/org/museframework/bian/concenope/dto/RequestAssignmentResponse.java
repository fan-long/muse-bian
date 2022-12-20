package org.museframework.bian.concenope.dto;

public class RequestAssignmentResponse {
    private org.museframework.bian.concenope.dto.bq.Assignment assignment;

    public void setAssignment(org.museframework.bian.concenope.dto.bq.Assignment assignment) {
        this.assignment = assignment;
    }

    public org.museframework.bian.concenope.dto.bq.Assignment getAssignment() {
        return assignment;
    }
}