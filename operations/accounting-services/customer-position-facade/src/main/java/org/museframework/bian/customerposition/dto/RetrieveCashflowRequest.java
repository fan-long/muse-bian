package org.museframework.bian.customerposition.dto;

public class RetrieveCashflowRequest {
    private String customerpositionid;

    private String cashflowid;

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
}