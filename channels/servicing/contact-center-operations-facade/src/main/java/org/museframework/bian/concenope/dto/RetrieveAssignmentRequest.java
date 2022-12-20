package org.museframework.bian.concenope.dto;

public class RetrieveAssignmentRequest {
    private String contactcenteroperationsid;

    private String assignmentid;

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
}