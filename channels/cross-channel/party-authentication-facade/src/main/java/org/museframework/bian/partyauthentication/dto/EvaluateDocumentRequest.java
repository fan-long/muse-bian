package org.museframework.bian.partyauthentication.dto;

public class EvaluateDocumentRequest {
    private String partyauthenticationid;

    private String documentid;

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