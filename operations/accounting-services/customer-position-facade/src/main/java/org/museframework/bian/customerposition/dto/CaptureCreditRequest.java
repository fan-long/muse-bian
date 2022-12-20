package org.museframework.bian.customerposition.dto;

public class CaptureCreditRequest {
    private String customerpositionid;

    private String creditid;

    private org.museframework.bian.customerposition.dto.bq.Credit credit;

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

    public void setCredit(org.museframework.bian.customerposition.dto.bq.Credit credit) {
        this.credit = credit;
    }

    public org.museframework.bian.customerposition.dto.bq.Credit getCredit() {
        return credit;
    }
}