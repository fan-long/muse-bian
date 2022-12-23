package org.museframework.bian.currencyexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFXTransactionCaptureRequest {
    @MetaField
    private String currencyexchangeid;

    @MetaField
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