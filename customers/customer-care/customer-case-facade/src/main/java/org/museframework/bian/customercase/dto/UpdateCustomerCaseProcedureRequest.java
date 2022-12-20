package org.museframework.bian.customercase.dto;

public class UpdateCustomerCaseProcedureRequest {
    private String customercaseid;

    private org.museframework.bian.customercase.dto.cr.CustomerCaseProcedure customerCaseProcedure;

    public void setCustomercaseid(String customercaseid) {
        this.customercaseid = customercaseid;
    }

    public String getCustomercaseid() {
        return customercaseid;
    }

    public void setCustomerCaseProcedure(org.museframework.bian.customercase.dto.cr.CustomerCaseProcedure customerCaseProcedure) {
        this.customerCaseProcedure = customerCaseProcedure;
    }

    public org.museframework.bian.customercase.dto.cr.CustomerCaseProcedure getCustomerCaseProcedure() {
        return customerCaseProcedure;
    }
}