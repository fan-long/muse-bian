package org.museframework.bian.customerworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteContactRequest {
    @MetaField
    private String customerworkbenchid;

    @MetaField
    private String contactid;

    @MetaField(ref=true)
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