package org.museframework.bian.letofcre.dto;

public class ExecuteCustomerPaymentTaskResponse {
    private org.museframework.bian.letofcre.dto.bq.CustomerPaymentTask customerPaymentTask;

    public void setCustomerPaymentTask(org.museframework.bian.letofcre.dto.bq.CustomerPaymentTask customerPaymentTask) {
        this.customerPaymentTask = customerPaymentTask;
    }

    public org.museframework.bian.letofcre.dto.bq.CustomerPaymentTask getCustomerPaymentTask() {
        return customerPaymentTask;
    }
}