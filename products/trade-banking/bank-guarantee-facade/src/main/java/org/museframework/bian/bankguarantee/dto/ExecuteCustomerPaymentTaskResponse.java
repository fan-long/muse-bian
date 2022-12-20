package org.museframework.bian.bankguarantee.dto;

public class ExecuteCustomerPaymentTaskResponse {
    private org.museframework.bian.bankguarantee.dto.bq.CustomerPaymentTask customerPaymentTask;

    public void setCustomerPaymentTask(org.museframework.bian.bankguarantee.dto.bq.CustomerPaymentTask customerPaymentTask) {
        this.customerPaymentTask = customerPaymentTask;
    }

    public org.museframework.bian.bankguarantee.dto.bq.CustomerPaymentTask getCustomerPaymentTask() {
        return customerPaymentTask;
    }
}