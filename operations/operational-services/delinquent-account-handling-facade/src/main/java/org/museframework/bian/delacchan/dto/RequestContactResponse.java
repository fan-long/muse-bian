package org.museframework.bian.delacchan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestContactResponse {
    @MetaField(ref=true)
    private org.museframework.bian.delacchan.dto.bq.Contact contact;

    public void setContact(org.museframework.bian.delacchan.dto.bq.Contact contact) {
        this.contact = contact;
    }

    public org.museframework.bian.delacchan.dto.bq.Contact getContact() {
        return contact;
    }
}