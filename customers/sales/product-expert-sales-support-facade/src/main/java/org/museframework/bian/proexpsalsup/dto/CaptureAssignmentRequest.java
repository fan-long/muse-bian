package org.museframework.bian.proexpsalsup.dto;

public class CaptureAssignmentRequest {
    private String productexpertsalessupportid;

    private String assignmentid;

    private org.museframework.bian.proexpsalsup.dto.bq.Assignment assignment;

    public void setProductexpertsalessupportid(String productexpertsalessupportid) {
        this.productexpertsalessupportid = productexpertsalessupportid;
    }

    public String getProductexpertsalessupportid() {
        return productexpertsalessupportid;
    }

    public void setAssignmentid(String assignmentid) {
        this.assignmentid = assignmentid;
    }

    public String getAssignmentid() {
        return assignmentid;
    }

    public void setAssignment(org.museframework.bian.proexpsalsup.dto.bq.Assignment assignment) {
        this.assignment = assignment;
    }

    public org.museframework.bian.proexpsalsup.dto.bq.Assignment getAssignment() {
        return assignment;
    }
}