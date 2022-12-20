package org.museframework.bian.documentdirectory.dto;

public class NotifyDocumentUpdateHistoryPropertiesRequest {
    private String documentdirectoryid;

    private String documentupdatehistorypropertiesid;

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
}