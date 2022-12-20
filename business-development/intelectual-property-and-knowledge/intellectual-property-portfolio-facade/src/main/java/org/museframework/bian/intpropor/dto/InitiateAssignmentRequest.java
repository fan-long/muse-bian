package org.museframework.bian.intpropor.dto;

public class InitiateAssignmentRequest {
    private String intellectualpropertyportfolioid;

    private String assignmentid;

    private org.museframework.bian.intpropor.dto.bq.Assignment assignment;

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

    public void setAssignment(org.museframework.bian.intpropor.dto.bq.Assignment assignment) {
        this.assignment = assignment;
    }

    public org.museframework.bian.intpropor.dto.bq.Assignment getAssignment() {
        return assignment;
    }
}