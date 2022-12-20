package org.museframework.bian.intrelman.dto;

public class RetrieveContactResponse {
    private org.museframework.bian.intrelman.dto.bq.Contact contact;

    public void setContact(org.museframework.bian.intrelman.dto.bq.Contact contact) {
        this.contact = contact;
    }

    public org.museframework.bian.intrelman.dto.bq.Contact getContact() {
        return contact;
    }
}