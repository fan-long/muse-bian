package org.museframework.bian.customerworkbench.dto;

public class RequestContactResponse {
    private org.museframework.bian.customerworkbench.dto.bq.Contact contact;

    public void setContact(org.museframework.bian.customerworkbench.dto.bq.Contact contact) {
        this.contact = contact;
    }

    public org.museframework.bian.customerworkbench.dto.bq.Contact getContact() {
        return contact;
    }
}