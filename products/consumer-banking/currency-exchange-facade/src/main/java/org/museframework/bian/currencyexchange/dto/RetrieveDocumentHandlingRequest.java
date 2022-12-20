package org.museframework.bian.currencyexchange.dto;

public class RetrieveDocumentHandlingRequest {
    private String currencyexchangeid;

    private String documenthandlingid;

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
}