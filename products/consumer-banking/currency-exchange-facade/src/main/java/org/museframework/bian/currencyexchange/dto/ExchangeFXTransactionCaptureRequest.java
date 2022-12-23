package org.museframework.bian.currencyexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeFXTransactionCaptureRequest {
    @MetaField
    private String currencyexchangeid;

    @MetaField
    private String fxtransactioncaptureid;

    @MetaField(ref=true)
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