package org.museframework.bian.chaactana.dto;

public class RetrieveCustomerFraudResponse {
    private org.museframework.bian.chaactana.dto.bq.CustomerFraud customerFraud;

    public void setCustomerFraud(org.museframework.bian.chaactana.dto.bq.CustomerFraud customerFraud) {
        this.customerFraud = customerFraud;
    }

    public org.museframework.bian.chaactana.dto.bq.CustomerFraud getCustomerFraud() {
        return customerFraud;
    }
}