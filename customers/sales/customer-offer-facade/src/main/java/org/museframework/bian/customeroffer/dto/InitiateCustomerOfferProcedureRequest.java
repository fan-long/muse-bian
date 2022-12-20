package org.museframework.bian.customeroffer.dto;

public class InitiateCustomerOfferProcedureRequest {
    private org.museframework.bian.customeroffer.dto.cr.CustomerOfferProcedure customerOfferProcedure;

    public void setCustomerOfferProcedure(org.museframework.bian.customeroffer.dto.cr.CustomerOfferProcedure customerOfferProcedure) {
        this.customerOfferProcedure = customerOfferProcedure;
    }

    public org.museframework.bian.customeroffer.dto.cr.CustomerOfferProcedure getCustomerOfferProcedure() {
        return customerOfferProcedure;
    }
}