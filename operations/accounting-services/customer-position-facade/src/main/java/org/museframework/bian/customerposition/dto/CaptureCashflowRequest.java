package org.museframework.bian.customerposition.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureCashflowRequest {
    @MetaField
    private String customerpositionid;

    @MetaField
    private String cashflowid;

    @MetaField(ref=true)
    private org.museframework.bian.customerposition.dto.bq.Cashflow cashflow;

    public void setCustomerpositionid(String customerpositionid) {
        this.customerpositionid = customerpositionid;
    }

    public String getCustomerpositionid() {
        return customerpositionid;
    }

    public void setCashflowid(String cashflowid) {
        this.cashflowid = cashflowid;
    }

    public String getCashflowid() {
        return cashflowid;
    }

    public void setCashflow(org.museframework.bian.customerposition.dto.bq.Cashflow cashflow) {
        this.cashflow = cashflow;
    }

    public org.museframework.bian.customerposition.dto.bq.Cashflow getCashflow() {
        return cashflow;
    }
}