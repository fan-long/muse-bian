package org.museframework.bian.atmnetope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFinancialTransactionCaptureRequest {
    @MetaField
    private String atmnetworkoperationsid;

    @MetaField
    private String financialtransactioncaptureid;

    @MetaField(ref=true)
    private org.museframework.bian.atmnetope.dto.bq.FinancialTransactionCapture financialTransactionCapture;

    public void setAtmnetworkoperationsid(String atmnetworkoperationsid) {
        this.atmnetworkoperationsid = atmnetworkoperationsid;
    }

    public String getAtmnetworkoperationsid() {
        return atmnetworkoperationsid;
    }

    public void setFinancialtransactioncaptureid(String financialtransactioncaptureid) {
        this.financialtransactioncaptureid = financialtransactioncaptureid;
    }

    public String getFinancialtransactioncaptureid() {
        return financialtransactioncaptureid;
    }

    public void setFinancialTransactionCapture(org.museframework.bian.atmnetope.dto.bq.FinancialTransactionCapture financialTransactionCapture) {
        this.financialTransactionCapture = financialTransactionCapture;
    }

    public org.museframework.bian.atmnetope.dto.bq.FinancialTransactionCapture getFinancialTransactionCapture() {
        return financialTransactionCapture;
    }
}