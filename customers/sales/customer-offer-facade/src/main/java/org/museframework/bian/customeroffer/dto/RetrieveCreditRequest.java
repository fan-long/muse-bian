package org.museframework.bian.customeroffer.dto;

public class RetrieveCreditRequest {
    private String customerofferid;

    private String creditid;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setCreditid(String creditid) {
        this.creditid = creditid;
    }

    public String getCreditid() {
        return creditid;
    }
}