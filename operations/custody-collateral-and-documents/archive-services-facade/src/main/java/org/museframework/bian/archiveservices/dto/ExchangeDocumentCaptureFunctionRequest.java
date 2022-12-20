package org.museframework.bian.archiveservices.dto;

public class ExchangeDocumentCaptureFunctionRequest {
    private String archiveservicesid;

    private String documentcapturefunctionid;

    private org.museframework.bian.archiveservices.dto.bq.DocumentCaptureFunction documentCaptureFunction;

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

    public void setDocumentCaptureFunction(org.museframework.bian.archiveservices.dto.bq.DocumentCaptureFunction documentCaptureFunction) {
        this.documentCaptureFunction = documentCaptureFunction;
    }

    public org.museframework.bian.archiveservices.dto.bq.DocumentCaptureFunction getDocumentCaptureFunction() {
        return documentCaptureFunction;
    }
}