package org.museframework.bian.frauddiagnosis.dto;

public class RetrieveCustomerBehaviorResponse {
    private org.museframework.bian.frauddiagnosis.dto.bq.CustomerBehavior customerBehavior;

    public void setCustomerBehavior(org.museframework.bian.frauddiagnosis.dto.bq.CustomerBehavior customerBehavior) {
        this.customerBehavior = customerBehavior;
    }

    public org.museframework.bian.frauddiagnosis.dto.bq.CustomerBehavior getCustomerBehavior() {
        return customerBehavior;
    }
}