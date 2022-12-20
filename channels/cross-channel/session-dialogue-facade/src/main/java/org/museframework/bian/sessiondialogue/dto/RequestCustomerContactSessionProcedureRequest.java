package org.museframework.bian.sessiondialogue.dto;

public class RequestCustomerContactSessionProcedureRequest {
    private String sessiondialogueid;

    private org.museframework.bian.sessiondialogue.dto.cr.CustomerContactSessionProcedure customerContactSessionProcedure;

    public void setSessiondialogueid(String sessiondialogueid) {
        this.sessiondialogueid = sessiondialogueid;
    }

    public String getSessiondialogueid() {
        return sessiondialogueid;
    }

    public void setCustomerContactSessionProcedure(org.museframework.bian.sessiondialogue.dto.cr.CustomerContactSessionProcedure customerContactSessionProcedure) {
        this.customerContactSessionProcedure = customerContactSessionProcedure;
    }

    public org.museframework.bian.sessiondialogue.dto.cr.CustomerContactSessionProcedure getCustomerContactSessionProcedure() {
        return customerContactSessionProcedure;
    }
}