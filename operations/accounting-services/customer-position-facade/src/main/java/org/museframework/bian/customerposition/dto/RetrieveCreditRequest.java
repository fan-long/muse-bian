package org.museframework.bian.customerposition.dto;

public class RetrieveCreditRequest {
    private String customerpositionid;

    private String creditid;

    public void setCustomerpositionid(String customerpositionid) {
        this.customerpositionid = customerpositionid;
    }

    public String getCustomerpositionid() {
        return customerpositionid;
    }

    public void setCreditid(String creditid) {
        this.creditid = creditid;
    }

    public String getCreditid() {
        return creditid;
    }
}