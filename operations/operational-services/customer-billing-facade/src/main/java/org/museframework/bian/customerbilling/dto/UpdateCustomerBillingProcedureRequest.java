package org.museframework.bian.customerbilling.dto;

public class UpdateCustomerBillingProcedureRequest {
    private String customerbillingid;

    private org.museframework.bian.customerbilling.dto.cr.CustomerBillingProcedure customerBillingProcedure;

    public void setCustomerbillingid(String customerbillingid) {
        this.customerbillingid = customerbillingid;
    }

    public String getCustomerbillingid() {
        return customerbillingid;
    }

    public void setCustomerBillingProcedure(org.museframework.bian.customerbilling.dto.cr.CustomerBillingProcedure customerBillingProcedure) {
        this.customerBillingProcedure = customerBillingProcedure;
    }

    public org.museframework.bian.customerbilling.dto.cr.CustomerBillingProcedure getCustomerBillingProcedure() {
        return customerBillingProcedure;
    }
}