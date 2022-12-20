package org.museframework.bian.documentdirectory.dto;

public class NotifyDocumentVersionPropertiesRequest {
    private String documentdirectoryid;

    private String documentversionpropertiesid;

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
}