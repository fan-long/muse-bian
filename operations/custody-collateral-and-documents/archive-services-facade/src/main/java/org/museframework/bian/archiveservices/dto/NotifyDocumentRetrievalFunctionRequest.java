package org.museframework.bian.archiveservices.dto;

public class NotifyDocumentRetrievalFunctionRequest {
    private String archiveservicesid;

    private String documentretrievalfunctionid;

    public void setArchiveservicesid(String archiveservicesid) {
        this.archiveservicesid = archiveservicesid;
    }

    public String getArchiveservicesid() {
        return archiveservicesid;
    }

    public void setDocumentretrievalfunctionid(String documentretrievalfunctionid) {
        this.documentretrievalfunctionid = documentretrievalfunctionid;
    }

    public String getDocumentretrievalfunctionid() {
        return documentretrievalfunctionid;
    }
}