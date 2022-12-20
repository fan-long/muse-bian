package org.museframework.bian.customerbilling.dto;

public class UpdateCustomerBillingProcedureResponse {
    private org.museframework.bian.customerbilling.dto.cr.CustomerBillingProcedure customerBillingProcedure;

    public void setCustomerBillingProcedure(org.museframework.bian.customerbilling.dto.cr.CustomerBillingProcedure customerBillingProcedure) {
        this.customerBillingProcedure = customerBillingProcedure;
    }

    public org.museframework.bian.customerbilling.dto.cr.CustomerBillingProcedure getCustomerBillingProcedure() {
        return customerBillingProcedure;
    }
}