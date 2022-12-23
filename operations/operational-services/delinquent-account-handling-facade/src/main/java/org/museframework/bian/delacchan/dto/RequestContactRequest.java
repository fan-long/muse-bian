package org.museframework.bian.delacchan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestContactRequest {
    @MetaField
    private String delinquentaccounthandlingid;

    @MetaField
    private String contactid;

    @MetaField(ref=true)
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