package org.museframework.bian.currencyexchange.dto;

public class ExecuteDocumentHandlingResponse {
    private org.museframework.bian.currencyexchange.dto.bq.DocumentHandling documentHandling;

    public void setDocumentHandling(org.museframework.bian.currencyexchange.dto.bq.DocumentHandling documentHandling) {
        this.documentHandling = documentHandling;
    }

    public org.museframework.bian.currencyexchange.dto.bq.DocumentHandling getDocumentHandling() {
        return documentHandling;
    }
}