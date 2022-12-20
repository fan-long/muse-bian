package org.museframework.bian.chaactana.dto;

public class ExecuteCustomerFraudResponse {
    private org.museframework.bian.chaactana.dto.bq.CustomerFraud customerFraud;

    public void setCustomerFraud(org.museframework.bian.chaactana.dto.bq.CustomerFraud customerFraud) {
        this.customerFraud = customerFraud;
    }

    public org.museframework.bian.chaactana.dto.bq.CustomerFraud getCustomerFraud() {
        return customerFraud;
    }
}