package org.museframework.bian.documentdirectory.dto;

public class ExecuteDocumentAmendmentPropertiesRequest {
    private String documentdirectoryid;

    private String documentamendmentpropertiesid;

    private org.museframework.bian.documentdirectory.dto.bq.DocumentAmendmentProperties documentAmendmentProperties;

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

    public void setDocumentAmendmentProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentAmendmentProperties documentAmendmentProperties) {
        this.documentAmendmentProperties = documentAmendmentProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentAmendmentProperties getDocumentAmendmentProperties() {
        return documentAmendmentProperties;
    }
}