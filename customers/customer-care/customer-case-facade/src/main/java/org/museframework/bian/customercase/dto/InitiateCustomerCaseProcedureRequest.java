package org.museframework.bian.customercase.dto;

public class InitiateCustomerCaseProcedureRequest {
    private org.museframework.bian.customercase.dto.cr.CustomerCaseProcedure customerCaseProcedure;

    public void setCustomerCaseProcedure(org.museframework.bian.customercase.dto.cr.CustomerCaseProcedure customerCaseProcedure) {
        this.customerCaseProcedure = customerCaseProcedure;
    }

    public org.museframework.bian.customercase.dto.cr.CustomerCaseProcedure getCustomerCaseProcedure() {
        return customerCaseProcedure;
    }
}