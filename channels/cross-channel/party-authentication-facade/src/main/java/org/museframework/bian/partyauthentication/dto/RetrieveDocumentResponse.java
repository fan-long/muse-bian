package org.museframework.bian.partyauthentication.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveDocumentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.partyauthentication.dto.bq.Document document;

    public void setDocument(org.museframework.bian.partyauthentication.dto.bq.Document document) {
        this.document = document;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Document getDocument() {
        return document;
    }
}