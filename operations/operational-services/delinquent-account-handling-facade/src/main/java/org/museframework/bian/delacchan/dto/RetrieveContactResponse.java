package org.museframework.bian.delacchan.dto;

public class RetrieveContactResponse {
    private org.museframework.bian.delacchan.dto.bq.Contact contact;

    public void setContact(org.museframework.bian.delacchan.dto.bq.Contact contact) {
        this.contact = contact;
    }

    public org.museframework.bian.delacchan.dto.bq.Contact getContact() {
        return contact;
    }
}