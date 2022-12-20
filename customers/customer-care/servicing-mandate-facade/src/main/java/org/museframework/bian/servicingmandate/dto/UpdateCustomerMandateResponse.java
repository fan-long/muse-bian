package org.museframework.bian.servicingmandate.dto;

public class UpdateCustomerMandateResponse {
    private org.museframework.bian.servicingmandate.dto.bq.CustomerMandate customerMandate;

    public void setCustomerMandate(org.museframework.bian.servicingmandate.dto.bq.CustomerMandate customerMandate) {
        this.customerMandate = customerMandate;
    }

    public org.museframework.bian.servicingmandate.dto.bq.CustomerMandate getCustomerMandate() {
        return customerMandate;
    }
}