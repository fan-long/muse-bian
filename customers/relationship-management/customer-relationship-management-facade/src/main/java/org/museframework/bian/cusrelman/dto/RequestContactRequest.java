package org.museframework.bian.cusrelman.dto;

public class RequestContactRequest {
    private String customerrelationshipmanagementid;

    private String contactid;

    private org.museframework.bian.cusrelman.dto.bq.Contact contact;

    public void setCustomerrelationshipmanagementid(String customerrelationshipmanagementid) {
        this.customerrelationshipmanagementid = customerrelationshipmanagementid;
    }

    public String getCustomerrelationshipmanagementid() {
        return customerrelationshipmanagementid;
    }

    public void setContactid(String contactid) {
        this.contactid = contactid;
    }

    public String getContactid() {
        return contactid;
    }

    public void setContact(org.museframework.bian.cusrelman.dto.bq.Contact contact) {
        this.contact = contact;
    }

    public org.museframework.bian.cusrelman.dto.bq.Contact getContact() {
        return contact;
    }
}