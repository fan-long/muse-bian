package org.museframework.bian.positionkeeping.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureFinancialTransactionCaptureRequest {
    @MetaField
    private String positionkeepingid;

    @MetaField
    private String financialtransactioncaptureid;

    @MetaField(ref=true)
    private org.museframework.bian.positionkeeping.dto.bq.FinancialTransactionCapture financialTransactionCapture;

    public void setPositionkeepingid(String positionkeepingid) {
        this.positionkeepingid = positionkeepingid;
    }

    public String getPositionkeepingid() {
        return positionkeepingid;
    }

    public void setFinancialtransactioncaptureid(String financialtransactioncaptureid) {
        this.financialtransactioncaptureid = financialtransactioncaptureid;
    }

    public String getFinancialtransactioncaptureid() {
        return financialtransactioncaptureid;
    }

    public void setFinancialTransactionCapture(org.museframework.bian.positionkeeping.dto.bq.FinancialTransactionCapture financialTransactionCapture) {
        this.financialTransactionCapture = financialTransactionCapture;
    }

    public org.museframework.bian.positionkeeping.dto.bq.FinancialTransactionCapture getFinancialTransactionCapture() {
        return financialTransactionCapture;
    }
}