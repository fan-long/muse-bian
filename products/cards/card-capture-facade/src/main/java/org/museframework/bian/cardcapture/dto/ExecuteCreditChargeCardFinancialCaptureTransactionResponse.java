package org.museframework.bian.cardcapture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteCreditChargeCardFinancialCaptureTransactionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardcapture.dto.cr.CreditChargeCardFinancialCaptureTransaction creditChargeCardFinancialCaptureTransaction;

    public void setCreditChargeCardFinancialCaptureTransaction(org.museframework.bian.cardcapture.dto.cr.CreditChargeCardFinancialCaptureTransaction creditChargeCardFinancialCaptureTransaction) {
        this.creditChargeCardFinancialCaptureTransaction = creditChargeCardFinancialCaptureTransaction;
    }

    public org.museframework.bian.cardcapture.dto.cr.CreditChargeCardFinancialCaptureTransaction getCreditChargeCardFinancialCaptureTransaction() {
        return creditChargeCardFinancialCaptureTransaction;
    }
}