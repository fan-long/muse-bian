package org.museframework.bian.documentdirectory.dto;

public class UpdateDocumentReferencePropertiesRequest {
    private String documentdirectoryid;

    private String documentreferencepropertiesid;

    private org.museframework.bian.documentdirectory.dto.bq.DocumentReferenceProperties documentReferenceProperties;

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

    public void setDocumentReferenceProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentReferenceProperties documentReferenceProperties) {
        this.documentReferenceProperties = documentReferenceProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentReferenceProperties getDocumentReferenceProperties() {
        return documentReferenceProperties;
    }
}