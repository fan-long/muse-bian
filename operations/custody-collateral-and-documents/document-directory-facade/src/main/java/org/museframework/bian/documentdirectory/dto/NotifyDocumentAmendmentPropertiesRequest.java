package org.museframework.bian.documentdirectory.dto;

public class NotifyDocumentAmendmentPropertiesRequest {
    private String documentdirectoryid;

    private String documentamendmentpropertiesid;

    public void setDocumentdirectoryid(String documentdirectoryid) {
        this.documentdirectoryid = documentdirectoryid;
    }

    public String getDocumentdirectoryid() {
        return documentdirectoryid;
    }

    public void setDocumentamendmentpropertiesid(String documentamendmentpropertiesid) {
        this.documentamendmentpropertiesid = documentamendmentpropertiesid;
    }

    public String getDocumentamendmentpropertiesid() {
        return documentamendmentpropertiesid;
    }
}