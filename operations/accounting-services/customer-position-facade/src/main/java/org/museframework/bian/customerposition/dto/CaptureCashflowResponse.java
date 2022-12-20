package org.museframework.bian.customerposition.dto;

public class CaptureCashflowResponse {
    private org.museframework.bian.customerposition.dto.bq.Cashflow cashflow;

    public void setCashflow(org.museframework.bian.customerposition.dto.bq.Cashflow cashflow) {
        this.cashflow = cashflow;
    }

    public org.museframework.bian.customerposition.dto.bq.Cashflow getCashflow() {
        return cashflow;
    }
}