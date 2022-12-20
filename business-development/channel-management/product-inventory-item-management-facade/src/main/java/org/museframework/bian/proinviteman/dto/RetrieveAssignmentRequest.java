package org.museframework.bian.proinviteman.dto;

public class RetrieveAssignmentRequest {
    private String productinventoryitemmanagementid;

    private String assignmentid;

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
}