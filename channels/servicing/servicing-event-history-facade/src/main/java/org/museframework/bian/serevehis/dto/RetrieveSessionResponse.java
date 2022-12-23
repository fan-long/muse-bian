package org.museframework.bian.serevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.serevehis.dto.bq.Session session;

    public void setSession(org.museframework.bian.serevehis.dto.bq.Session session) {
        this.session = session;
    }

    public org.museframework.bian.serevehis.dto.bq.Session getSession() {
        return session;
    }
}