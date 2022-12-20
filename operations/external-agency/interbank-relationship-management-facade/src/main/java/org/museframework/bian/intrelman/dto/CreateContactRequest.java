package org.museframework.bian.intrelman.dto;

public class CreateContactRequest {
    private String interbankrelationshipmanagementid;

    private String contactid;

    private org.museframework.bian.intrelman.dto.bq.Contact contact;

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

    public void setContact(org.museframework.bian.intrelman.dto.bq.Contact contact) {
        this.contact = contact;
    }

    public org.museframework.bian.intrelman.dto.bq.Contact getContact() {
        return contact;
    }
}