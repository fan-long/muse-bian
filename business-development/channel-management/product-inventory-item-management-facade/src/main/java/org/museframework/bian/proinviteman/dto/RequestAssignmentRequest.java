package org.museframework.bian.proinviteman.dto;

public class RequestAssignmentRequest {
    private String productinventoryitemmanagementid;

    private String assignmentid;

    private org.museframework.bian.proinviteman.dto.bq.Assignment assignment;

    public void setProductinventoryitemmanagementid(String productinventoryitemmanagementid) {
        this.productinventoryitemmanagementid = productinventoryitemmanagementid;
    }

    public String getProductinventoryitemmanagementid() {
        return productinventoryitemmanagementid;
    }

    public void setAssignmentid(String assignmentid) {
        this.assignmentid = assignmentid;
    }

    public String getAssignmentid() {
        return assignmentid;
    }

    public void setAssignment(org.museframework.bian.proinviteman.dto.bq.Assignment assignment) {
        this.assignment = assignment;
    }

    public org.museframework.bian.proinviteman.dto.bq.Assignment getAssignment() {
        return assignment;
    }
}