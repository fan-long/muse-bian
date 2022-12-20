package org.museframework.bian.documentdirectory.dto;

public class UpdateDocumentUpdateHistoryPropertiesRequest {
    private String documentdirectoryid;

    private String documentupdatehistorypropertiesid;

    private org.museframework.bian.documentdirectory.dto.bq.DocumentUpdateHistoryProperties documentUpdateHistoryProperties;

    public void setDocumentdirectoryid(String documentdirectoryid) {
        this.documentdirectoryid = documentdirectoryid;
    }

    public String getDocumentdirectoryid() {
        return documentdirectoryid;
    }

    public void setDocumentupdatehistorypropertiesid(String documentupdatehistorypropertiesid) {
        this.documentupdatehistorypropertiesid = documentupdatehistorypropertiesid;
    }

    public String getDocumentupdatehistorypropertiesid() {
        return documentupdatehistorypropertiesid;
    }

    public void setDocumentUpdateHistoryProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentUpdateHistoryProperties documentUpdateHistoryProperties) {
        this.documentUpdateHistoryProperties = documentUpdateHistoryProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentUpdateHistoryProperties getDocumentUpdateHistoryProperties() {
        return documentUpdateHistoryProperties;
    }
}