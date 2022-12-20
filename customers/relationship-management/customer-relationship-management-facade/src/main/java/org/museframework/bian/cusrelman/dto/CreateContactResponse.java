package org.museframework.bian.cusrelman.dto;

public class CreateContactResponse {
    private org.museframework.bian.cusrelman.dto.bq.Contact contact;

    public void setContact(org.museframework.bian.cusrelman.dto.bq.Contact contact) {
        this.contact = contact;
    }

    public org.museframework.bian.cusrelman.dto.bq.Contact getContact() {
        return contact;
    }
}