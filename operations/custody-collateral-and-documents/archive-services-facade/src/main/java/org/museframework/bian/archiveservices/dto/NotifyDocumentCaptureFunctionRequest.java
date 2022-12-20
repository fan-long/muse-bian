package org.museframework.bian.archiveservices.dto;

public class NotifyDocumentCaptureFunctionRequest {
    private String archiveservicesid;

    private String documentcapturefunctionid;

    public void setArchiveservicesid(String archiveservicesid) {
        this.archiveservicesid = archiveservicesid;
    }

    public String getArchiveservicesid() {
        return archiveservicesid;
    }

    public void setDocumentcapturefunctionid(String documentcapturefunctionid) {
        this.documentcapturefunctionid = documentcapturefunctionid;
    }

    public String getDocumentcapturefunctionid() {
        return documentcapturefunctionid;
    }
}