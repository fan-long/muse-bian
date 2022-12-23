package org.museframework.bian.positionkeeping.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureFinancialTransactionCaptureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.positionkeeping.dto.bq.FinancialTransactionCapture financialTransactionCapture;

    public void setFinancialTransactionCapture(org.museframework.bian.positionkeeping.dto.bq.FinancialTransactionCapture financialTransactionCapture) {
        this.financialTransactionCapture = financialTransactionCapture;
    }

    public org.museframework.bian.positionkeeping.dto.bq.FinancialTransactionCapture getFinancialTransactionCapture() {
        return financialTransactionCapture;
    }
}