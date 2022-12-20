package org.museframework.bian.archiveservices.dto;

public class UpdateDocumentCaptureFunctionResponse {
    private org.museframework.bian.archiveservices.dto.bq.DocumentCaptureFunction documentCaptureFunction;

    public void setDocumentCaptureFunction(org.museframework.bian.archiveservices.dto.bq.DocumentCaptureFunction documentCaptureFunction) {
        this.documentCaptureFunction = documentCaptureFunction;
    }

    public org.museframework.bian.archiveservices.dto.bq.DocumentCaptureFunction getDocumentCaptureFunction() {
        return documentCaptureFunction;
    }
}