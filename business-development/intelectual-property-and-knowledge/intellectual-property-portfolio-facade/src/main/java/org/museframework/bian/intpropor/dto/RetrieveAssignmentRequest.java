package org.museframework.bian.intpropor.dto;

public class RetrieveAssignmentRequest {
    private String intellectualpropertyportfolioid;

    private String assignmentid;

    public void setIntellectualpropertyportfolioid(String intellectualpropertyportfolioid) {
        this.intellectualpropertyportfolioid = intellectualpropertyportfolioid;
    }

    public String getIntellectualpropertyportfolioid() {
        return intellectualpropertyportfolioid;
    }

    public void setAssignmentid(String assignmentid) {
        this.assignmentid = assignmentid;
    }

    public String getAssignmentid() {
        return assignmentid;
    }
}