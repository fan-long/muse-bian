package org.museframework.bian.letofcre.dto;

public class RequestCustomerPaymentTaskRequest {
    private String letterofcreditid;

    private String customerpaymenttaskid;

    private org.museframework.bian.letofcre.dto.bq.CustomerPaymentTask customerPaymentTask;

    public void setLetterofcreditid(String letterofcreditid) {
        this.letterofcreditid = letterofcreditid;
    }

    public String getLetterofcreditid() {
        return letterofcreditid;
    }

    public void setCustomerpaymenttaskid(String customerpaymenttaskid) {
        this.customerpaymenttaskid = customerpaymenttaskid;
    }

    public String getCustomerpaymenttaskid() {
        return customerpaymenttaskid;
    }

    public void setCustomerPaymentTask(org.museframework.bian.letofcre.dto.bq.CustomerPaymentTask customerPaymentTask) {
        this.customerPaymentTask = customerPaymentTask;
    }

    public org.museframework.bian.letofcre.dto.bq.CustomerPaymentTask getCustomerPaymentTask() {
        return customerPaymentTask;
    }
}