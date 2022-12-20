package org.museframework.bian.documentdirectory.dto;

public class NotifyDocumentReferencePropertiesRequest {
    private String documentdirectoryid;

    private String documentreferencepropertiesid;

    public void setDocumentdirectoryid(String documentdirectoryid) {
        this.documentdirectoryid = documentdirectoryid;
    }

    public String getDocumentdirectoryid() {
        return documentdirectoryid;
    }

    public void setDocumentreferencepropertiesid(String documentreferencepropertiesid) {
        this.documentreferencepropertiesid = documentreferencepropertiesid;
    }

    public String getDocumentreferencepropertiesid() {
        return documentreferencepropertiesid;
    }
}