package org.museframework.bian.customerworkbench.dto;

public class UpdateCustomerWorkbenchOperatingSessionRequest {
    private String customerworkbenchid;

    private org.museframework.bian.customerworkbench.dto.cr.CustomerWorkbenchOperatingSession customerWorkbenchOperatingSession;

    public void setCustomerworkbenchid(String customerworkbenchid) {
        this.customerworkbenchid = customerworkbenchid;
    }

    public String getCustomerworkbenchid() {
        return customerworkbenchid;
    }

    public void setCustomerWorkbenchOperatingSession(org.museframework.bian.customerworkbench.dto.cr.CustomerWorkbenchOperatingSession customerWorkbenchOperatingSession) {
        this.customerWorkbenchOperatingSession = customerWorkbenchOperatingSession;
    }

    public org.museframework.bian.customerworkbench.dto.cr.CustomerWorkbenchOperatingSession getCustomerWorkbenchOperatingSession() {
        return customerWorkbenchOperatingSession;
    }
}