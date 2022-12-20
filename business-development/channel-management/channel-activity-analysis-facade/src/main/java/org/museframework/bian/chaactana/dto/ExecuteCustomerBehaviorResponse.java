package org.museframework.bian.chaactana.dto;

public class ExecuteCustomerBehaviorResponse {
    private org.museframework.bian.chaactana.dto.bq.CustomerBehavior customerBehavior;

    public void setCustomerBehavior(org.museframework.bian.chaactana.dto.bq.CustomerBehavior customerBehavior) {
        this.customerBehavior = customerBehavior;
    }

    public org.museframework.bian.chaactana.dto.bq.CustomerBehavior getCustomerBehavior() {
        return customerBehavior;
    }
}