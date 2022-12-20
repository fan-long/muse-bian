package org.museframework.bian.currencyexchange.dto;

public class RetrieveDocumentHandlingResponse {
    private org.museframework.bian.currencyexchange.dto.bq.DocumentHandling documentHandling;

    public void setDocumentHandling(org.museframework.bian.currencyexchange.dto.bq.DocumentHandling documentHandling) {
        this.documentHandling = documentHandling;
    }

    public org.museframework.bian.currencyexchange.dto.bq.DocumentHandling getDocumentHandling() {
        return documentHandling;
    }
}