package org.museframework.bian.partyauthentication.dto;

public class RetrieveDocumentRequest {
    private String partyauthenticationid;

    private String documentid;

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
}