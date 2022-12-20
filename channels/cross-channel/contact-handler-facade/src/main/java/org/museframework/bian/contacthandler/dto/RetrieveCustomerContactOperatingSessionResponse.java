package org.museframework.bian.contacthandler.dto;

public class RetrieveCustomerContactOperatingSessionResponse {
    private org.museframework.bian.contacthandler.dto.cr.CustomerContactOperatingSession customerContactOperatingSession;

    public void setCustomerContactOperatingSession(org.museframework.bian.contacthandler.dto.cr.CustomerContactOperatingSession customerContactOperatingSession) {
        this.customerContactOperatingSession = customerContactOperatingSession;
    }

    public org.museframework.bian.contacthandler.dto.cr.CustomerContactOperatingSession getCustomerContactOperatingSession() {
        return customerContactOperatingSession;
    }
}