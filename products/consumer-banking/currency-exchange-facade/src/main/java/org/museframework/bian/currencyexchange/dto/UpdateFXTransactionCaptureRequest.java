package org.museframework.bian.currencyexchange.dto;

public class UpdateFXTransactionCaptureRequest {
    private String currencyexchangeid;

    private String fxtransactioncaptureid;

    private org.museframework.bian.currencyexchange.dto.bq.FXTransactionCapture fXTransactionCapture;

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

    public void setfXTransactionCapture(org.museframework.bian.currencyexchange.dto.bq.FXTransactionCapture fXTransactionCapture) {
        this.fXTransactionCapture = fXTransactionCapture;
    }

    public org.museframework.bian.currencyexchange.dto.bq.FXTransactionCapture getfXTransactionCapture() {
        return fXTransactionCapture;
    }
}