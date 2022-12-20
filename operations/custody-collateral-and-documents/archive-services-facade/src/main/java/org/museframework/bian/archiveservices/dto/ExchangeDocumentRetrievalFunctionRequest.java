package org.museframework.bian.archiveservices.dto;

public class ExchangeDocumentRetrievalFunctionRequest {
    private String archiveservicesid;

    private String documentretrievalfunctionid;

    private org.museframework.bian.archiveservices.dto.bq.DocumentRetrievalFunction documentRetrievalFunction;

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

    public void setDocumentRetrievalFunction(org.museframework.bian.archiveservices.dto.bq.DocumentRetrievalFunction documentRetrievalFunction) {
        this.documentRetrievalFunction = documentRetrievalFunction;
    }

    public org.museframework.bian.archiveservices.dto.bq.DocumentRetrievalFunction getDocumentRetrievalFunction() {
        return documentRetrievalFunction;
    }
}