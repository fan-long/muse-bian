package org.museframework.bian.cusrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CreateContactRequest {
    @MetaField
    private String customerrelationshipmanagementid;

    @MetaField
    private String contactid;

    @MetaField(ref=true)
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