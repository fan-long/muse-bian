package org.museframework.bian.documentdirectory.dto;

public class RequestDocumentVersionPropertiesRequest {
    private String documentdirectoryid;

    private String documentversionpropertiesid;

    private org.museframework.bian.documentdirectory.dto.bq.DocumentVersionProperties documentVersionProperties;

    public void setDocumentdirectoryid(String documentdirectoryid) {
        this.documentdirectoryid = documentdirectoryid;
    }

    public String getDocumentdirectoryid() {
        return documentdirectoryid;
    }

    public void setDocumentversionpropertiesid(String documentversionpropertiesid) {
        this.documentversionpropertiesid = documentversionpropertiesid;
    }

    public String getDocumentversionpropertiesid() {
        return documentversionpropertiesid;
    }

    public void setDocumentVersionProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentVersionProperties documentVersionProperties) {
        this.documentVersionProperties = documentVersionProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentVersionProperties getDocumentVersionProperties() {
        return documentVersionProperties;
    }
}