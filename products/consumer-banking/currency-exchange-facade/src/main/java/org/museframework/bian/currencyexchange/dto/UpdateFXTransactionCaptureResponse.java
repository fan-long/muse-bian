package org.museframework.bian.currencyexchange.dto;

public class UpdateFXTransactionCaptureResponse {
    private org.museframework.bian.currencyexchange.dto.bq.FXTransactionCapture fXTransactionCapture;

    public void setfXTransactionCapture(org.museframework.bian.currencyexchange.dto.bq.FXTransactionCapture fXTransactionCapture) {
        this.fXTransactionCapture = fXTransactionCapture;
    }

    public org.museframework.bian.currencyexchange.dto.bq.FXTransactionCapture getfXTransactionCapture() {
        return fXTransactionCapture;
    }
}