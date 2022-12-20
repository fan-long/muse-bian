package org.museframework.bian.archiveservices.dto;

public class NotifyDocumentMaintenanceFunctionRequest {
    private String archiveservicesid;

    private String documentmaintenancefunctionid;

    public void setArchiveservicesid(String archiveservicesid) {
        this.archiveservicesid = archiveservicesid;
    }

    public String getArchiveservicesid() {
        return archiveservicesid;
    }

    public void setDocumentmaintenancefunctionid(String documentmaintenancefunctionid) {
        this.documentmaintenancefunctionid = documentmaintenancefunctionid;
    }

    public String getDocumentmaintenancefunctionid() {
        return documentmaintenancefunctionid;
    }
}