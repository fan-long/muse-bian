package org.museframework.bian.currencyexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateFXTransactionCaptureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.currencyexchange.dto.bq.FXTransactionCapture fXTransactionCapture;

    public void setfXTransactionCapture(org.museframework.bian.currencyexchange.dto.bq.FXTransactionCapture fXTransactionCapture) {
        this.fXTransactionCapture = fXTransactionCapture;
    }

    public org.museframework.bian.currencyexchange.dto.bq.FXTransactionCapture getfXTransactionCapture() {
        return fXTransactionCapture;
    }
}