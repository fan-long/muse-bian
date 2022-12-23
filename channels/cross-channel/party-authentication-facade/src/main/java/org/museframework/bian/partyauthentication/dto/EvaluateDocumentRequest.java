package org.museframework.bian.partyauthentication.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluateDocumentRequest {
    @MetaField
    private String partyauthenticationid;

    @MetaField
    private String documentid;

    @MetaField(ref=true)
    private org.museframework.bian.partyauthentication.dto.bq.Document document;

    public void setPartyauthenticationid(String partyauthenticationid) {
        this.partyauthenticationid = partyauthenticationid;
    }

    public String getPartyauthenticationid() {
        return partyauthenticationid;
    }

    public void setDocumentid(String documentid) {
        this.documentid = documentid;
    }

    public String getDocumentid() {
        return documentid;
    }

    public void setDocument(org.museframework.bian.partyauthentication.dto.bq.Document document) {
        this.document = document;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Document getDocument() {
        return document;
    }
}