package org.museframework.bian.sessiondialogue.dto;

public class InitiateCustomerContactSessionProcedureResponse {
    private org.museframework.bian.sessiondialogue.dto.cr.CustomerContactSessionProcedure customerContactSessionProcedure;

    public void setCustomerContactSessionProcedure(org.museframework.bian.sessiondialogue.dto.cr.CustomerContactSessionProcedure customerContactSessionProcedure) {
        this.customerContactSessionProcedure = customerContactSessionProcedure;
    }

    public org.museframework.bian.sessiondialogue.dto.cr.CustomerContactSessionProcedure getCustomerContactSessionProcedure() {
        return customerContactSessionProcedure;
    }
}