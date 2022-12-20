package org.museframework.bian.serevehis.dto;

public class CaptureAssignmentResponse {
    private org.museframework.bian.serevehis.dto.bq.Assignment assignment;

    public void setAssignment(org.museframework.bian.serevehis.dto.bq.Assignment assignment) {
        this.assignment = assignment;
    }

    public org.museframework.bian.serevehis.dto.bq.Assignment getAssignment() {
        return assignment;
    }
}