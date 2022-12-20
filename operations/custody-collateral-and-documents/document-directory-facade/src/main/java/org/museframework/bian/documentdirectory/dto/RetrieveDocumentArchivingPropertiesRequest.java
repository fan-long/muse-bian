package org.museframework.bian.documentdirectory.dto;

public class RetrieveDocumentArchivingPropertiesRequest {
    private String documentdirectoryid;

    private String documentarchivingpropertiesid;

    public void setDocumentdirectoryid(String documentdirectoryid) {
        this.documentdirectoryid = documentdirectoryid;
    }

    public String getDocumentdirectoryid() {
        return documentdirectoryid;
    }

    public void setDocumentarchivingpropertiesid(String documentarchivingpropertiesid) {
        this.documentarchivingpropertiesid = documentarchivingpropertiesid;
    }

    public String getDocumentarchivingpropertiesid() {
        return documentarchivingpropertiesid;
    }
}