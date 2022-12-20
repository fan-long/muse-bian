package org.museframework.bian.concenope.dto;

public class UpdateAssignmentRequest {
    private String contactcenteroperationsid;

    private String assignmentid;

    private org.museframework.bian.concenope.dto.bq.Assignment assignment;

    public void setContactcenteroperationsid(String contactcenteroperationsid) {
        this.contactcenteroperationsid = contactcenteroperationsid;
    }

    public String getContactcenteroperationsid() {
        return contactcenteroperationsid;
    }

    public void setAssignmentid(String assignmentid) {
        this.assignmentid = assignmentid;
    }

    public String getAssignmentid() {
        return assignmentid;
    }

    public void setAssignment(org.museframework.bian.concenope.dto.bq.Assignment assignment) {
        this.assignment = assignment;
    }

    public org.museframework.bian.concenope.dto.bq.Assignment getAssignment() {
        return assignment;
    }
}