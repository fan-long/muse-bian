package org.museframework.bian.contacthandler.dto;

public class ExecuteCustomerContactOperatingSessionRequest {
    private String contacthandlerid;

    private org.museframework.bian.contacthandler.dto.cr.CustomerContactOperatingSession customerContactOperatingSession;

    public void setContacthandlerid(String contacthandlerid) {
        this.contacthandlerid = contacthandlerid;
    }

    public String getContacthandlerid() {
        return contacthandlerid;
    }

    public void setCustomerContactOperatingSession(org.museframework.bian.contacthandler.dto.cr.CustomerContactOperatingSession customerContactOperatingSession) {
        this.customerContactOperatingSession = customerContactOperatingSession;
    }

    public org.museframework.bian.contacthandler.dto.cr.CustomerContactOperatingSession getCustomerContactOperatingSession() {
        return customerContactOperatingSession;
    }
}