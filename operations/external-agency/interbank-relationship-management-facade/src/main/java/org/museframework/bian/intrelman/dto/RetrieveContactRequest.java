package org.museframework.bian.intrelman.dto;

public class RetrieveContactRequest {
    private String interbankrelationshipmanagementid;

    private String contactid;

    public void setInterbankrelationshipmanagementid(String interbankrelationshipmanagementid) {
        this.interbankrelationshipmanagementid = interbankrelationshipmanagementid;
    }

    public String getInterbankrelationshipmanagementid() {
        return interbankrelationshipmanagementid;
    }

    public void setContactid(String contactid) {
        this.contactid = contactid;
    }

    public String getContactid() {
        return contactid;
    }
}