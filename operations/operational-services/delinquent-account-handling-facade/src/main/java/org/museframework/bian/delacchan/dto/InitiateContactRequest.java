package org.museframework.bian.delacchan.dto;

public class InitiateContactRequest {
    private String delinquentaccounthandlingid;

    private String contactid;

    private org.museframework.bian.delacchan.dto.bq.Contact contact;

    public void setDelinquentaccounthandlingid(String delinquentaccounthandlingid) {
        this.delinquentaccounthandlingid = delinquentaccounthandlingid;
    }

    public String getDelinquentaccounthandlingid() {
        return delinquentaccounthandlingid;
    }

    public void setContactid(String contactid) {
        this.contactid = contactid;
    }

    public String getContactid() {
        return contactid;
    }

    public void setContact(org.museframework.bian.delacchan.dto.bq.Contact contact) {
        this.contact = contact;
    }

    public org.museframework.bian.delacchan.dto.bq.Contact getContact() {
        return contact;
    }
}