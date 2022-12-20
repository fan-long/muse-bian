package org.museframework.bian.currencyexchange.dto;

public class RetrieveFXTransactionCaptureRequest {
    private String currencyexchangeid;

    private String fxtransactioncaptureid;

    public void setCurrencyexchangeid(String currencyexchangeid) {
        this.currencyexchangeid = currencyexchangeid;
    }

    public String getCurrencyexchangeid() {
        return currencyexchangeid;
    }

    public void setFxtransactioncaptureid(String fxtransactioncaptureid) {
        this.fxtransactioncaptureid = fxtransactioncaptureid;
    }

    public String getFxtransactioncaptureid() {
        return fxtransactioncaptureid;
    }
}