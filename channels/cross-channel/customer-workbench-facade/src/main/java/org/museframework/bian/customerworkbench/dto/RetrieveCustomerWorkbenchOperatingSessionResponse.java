package org.museframework.bian.customerworkbench.dto;

public class RetrieveCustomerWorkbenchOperatingSessionResponse {
    private org.museframework.bian.customerworkbench.dto.cr.CustomerWorkbenchOperatingSession customerWorkbenchOperatingSession;

    public void setCustomerWorkbenchOperatingSession(org.museframework.bian.customerworkbench.dto.cr.CustomerWorkbenchOperatingSession customerWorkbenchOperatingSession) {
        this.customerWorkbenchOperatingSession = customerWorkbenchOperatingSession;
    }

    public org.museframework.bian.customerworkbench.dto.cr.CustomerWorkbenchOperatingSession getCustomerWorkbenchOperatingSession() {
        return customerWorkbenchOperatingSession;
    }
}