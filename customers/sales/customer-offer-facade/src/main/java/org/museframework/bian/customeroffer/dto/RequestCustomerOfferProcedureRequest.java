package org.museframework.bian.customeroffer.dto;

public class RequestCustomerOfferProcedureRequest {
    private String customerofferid;

    private org.museframework.bian.customeroffer.dto.cr.CustomerOfferProcedure customerOfferProcedure;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setCustomerOfferProcedure(org.museframework.bian.customeroffer.dto.cr.CustomerOfferProcedure customerOfferProcedure) {
        this.customerOfferProcedure = customerOfferProcedure;
    }

    public org.museframework.bian.customeroffer.dto.cr.CustomerOfferProcedure getCustomerOfferProcedure() {
        return customerOfferProcedure;
    }
}