package org.museframework.bian.cardcollections.dto;

public class RetrieveAssignmentRequest {
    private String cardcollectionsid;

    private String assignmentid;

    public void setCardcollectionsid(String cardcollectionsid) {
        this.cardcollectionsid = cardcollectionsid;
    }

    public String getCardcollectionsid() {
        return cardcollectionsid;
    }

    public void setAssignmentid(String assignmentid) {
        this.assignmentid = assignmentid;
    }

    public String getAssignmentid() {
        return assignmentid;
    }
}