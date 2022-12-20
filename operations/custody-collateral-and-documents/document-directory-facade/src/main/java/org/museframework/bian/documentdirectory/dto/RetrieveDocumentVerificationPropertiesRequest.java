package org.museframework.bian.documentdirectory.dto;

public class RetrieveDocumentVerificationPropertiesRequest {
    private String documentdirectoryid;

    private String documentverificationpropertiesid;

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
}