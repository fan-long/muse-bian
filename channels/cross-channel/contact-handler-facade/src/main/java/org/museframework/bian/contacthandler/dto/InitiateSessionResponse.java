package org.museframework.bian.contacthandler.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.contacthandler.dto.bq.Session session;

    public void setSession(org.museframework.bian.contacthandler.dto.bq.Session session) {
        this.session = session;
    }

    public org.museframework.bian.contacthandler.dto.bq.Session getSession() {
        return session;
    }
}