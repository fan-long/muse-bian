package org.museframework.bian.customerposition.dto;

public class CaptureCashflowRequest {
    private String customerpositionid;

    private String cashflowid;

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