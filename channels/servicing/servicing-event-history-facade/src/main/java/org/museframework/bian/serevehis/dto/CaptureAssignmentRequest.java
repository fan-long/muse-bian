package org.museframework.bian.serevehis.dto;

public class CaptureAssignmentRequest {
    private String servicingeventhistoryid;

    private String assignmentid;

    private org.museframework.bian.serevehis.dto.bq.Assignment assignment;

    public void setServicingeventhistoryid(String servicingeventhistoryid) {
        this.servicingeventhistoryid = servicingeventhistoryid;
    }

    public String getServicingeventhistoryid() {
        return servicingeventhistoryid;
    }

    public void setAssignmentid(String assignmentid) {
        this.assignmentid = assignmentid;
    }

    public String getAssignmentid() {
        return assignmentid;
    }

    public void setAssignment(org.museframework.bian.serevehis.dto.bq.Assignment assignment) {
        this.assignment = assignment;
    }

    public org.museframework.bian.serevehis.dto.bq.Assignment getAssignment() {
        return assignment;
    }
}