package org.museframework.bian.currencyexchange.dto;

public class ExecuteDocumentHandlingRequest {
    private String currencyexchangeid;

    private String documenthandlingid;

    private org.museframework.bian.currencyexchange.dto.bq.DocumentHandling documentHandling;

    public void setCurrencyexchangeid(String currencyexchangeid) {
        this.currencyexchangeid = currencyexchangeid;
    }

    public String getCurrencyexchangeid() {
        return currencyexchangeid;
    }

    public void setDocumenthandlingid(String documenthandlingid) {
        this.documenthandlingid = documenthandlingid;
    }

    public String getDocumenthandlingid() {
        return documenthandlingid;
    }

    public void setDocumentHandling(org.museframework.bian.currencyexchange.dto.bq.DocumentHandling documentHandling) {
        this.documentHandling = documentHandling;
    }

    public org.museframework.bian.currencyexchange.dto.bq.DocumentHandling getDocumentHandling() {
        return documentHandling;
    }
}