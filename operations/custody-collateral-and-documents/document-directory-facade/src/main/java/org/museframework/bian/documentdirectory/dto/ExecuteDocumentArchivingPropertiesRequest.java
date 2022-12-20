package org.museframework.bian.documentdirectory.dto;

public class ExecuteDocumentArchivingPropertiesRequest {
    private String documentdirectoryid;

    private String documentarchivingpropertiesid;

    private org.museframework.bian.documentdirectory.dto.bq.DocumentArchivingProperties documentArchivingProperties;

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

    public void setDocumentArchivingProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentArchivingProperties documentArchivingProperties) {
        this.documentArchivingProperties = documentArchivingProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentArchivingProperties getDocumentArchivingProperties() {
        return documentArchivingProperties;
    }
}