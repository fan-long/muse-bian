package org.museframework.bian.customerworkbench.dto;

public class ExecuteContactRequest {
    private String customerworkbenchid;

    private String contactid;

    private org.museframework.bian.customerworkbench.dto.bq.Contact contact;

    public void setCustomerworkbenchid(String customerworkbenchid) {
        this.customerworkbenchid = customerworkbenchid;
    }

    public String getCustomerworkbenchid() {
        return customerworkbenchid;
    }

    public void setContactid(String contactid) {
        this.contactid = contactid;
    }

    public String getContactid() {
        return contactid;
    }

    public void setContact(org.museframework.bian.customerworkbench.dto.bq.Contact contact) {
        this.contact = contact;
    }

    public org.museframework.bian.customerworkbench.dto.bq.Contact getContact() {
        return contact;
    }
}