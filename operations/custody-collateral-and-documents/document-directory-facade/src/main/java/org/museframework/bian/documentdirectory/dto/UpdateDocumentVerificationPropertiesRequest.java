package org.museframework.bian.documentdirectory.dto;

public class UpdateDocumentVerificationPropertiesRequest {
    private String documentdirectoryid;

    private String documentverificationpropertiesid;

    private org.museframework.bian.documentdirectory.dto.bq.DocumentVerificationProperties documentVerificationProperties;

    public void setDocumentdirectoryid(String documentdirectoryid) {
        this.documentdirectoryid = documentdirectoryid;
    }

    public String getDocumentdirectoryid() {
        return documentdirectoryid;
    }

    public void setDocumentverificationpropertiesid(String documentverificationpropertiesid) {
        this.documentverificationpropertiesid = documentverificationpropertiesid;
    }

    public String getDocumentverificationpropertiesid() {
        return documentverificationpropertiesid;
    }

    public void setDocumentVerificationProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentVerificationProperties documentVerificationProperties) {
        this.documentVerificationProperties = documentVerificationProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentVerificationProperties getDocumentVerificationProperties() {
        return documentVerificationProperties;
    }
}