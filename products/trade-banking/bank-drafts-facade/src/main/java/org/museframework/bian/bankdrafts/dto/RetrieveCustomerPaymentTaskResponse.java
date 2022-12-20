package org.museframework.bian.bankdrafts.dto;

public class RetrieveCustomerPaymentTaskResponse {
    private org.museframework.bian.bankdrafts.dto.bq.CustomerPaymentTask customerPaymentTask;

    public void setCustomerPaymentTask(org.museframework.bian.bankdrafts.dto.bq.CustomerPaymentTask customerPaymentTask) {
        this.customerPaymentTask = customerPaymentTask;
    }

    public org.museframework.bian.bankdrafts.dto.bq.CustomerPaymentTask getCustomerPaymentTask() {
        return customerPaymentTask;
    }
}