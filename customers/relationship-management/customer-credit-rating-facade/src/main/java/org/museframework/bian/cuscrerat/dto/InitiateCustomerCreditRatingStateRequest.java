package org.museframework.bian.cuscrerat.dto;

public class InitiateCustomerCreditRatingStateRequest {
    private org.museframework.bian.cuscrerat.dto.cr.CustomerCreditRatingState customerCreditRatingState;

    public void setCustomerCreditRatingState(org.museframework.bian.cuscrerat.dto.cr.CustomerCreditRatingState customerCreditRatingState) {
        this.customerCreditRatingState = customerCreditRatingState;
    }

    public org.museframework.bian.cuscrerat.dto.cr.CustomerCreditRatingState getCustomerCreditRatingState() {
        return customerCreditRatingState;
    }
}