package org.museframework.bian.currentaccount.dto;

public class UpdateCurrentAccountFacilityRequest {
    private String currentaccountid;

    private org.museframework.bian.currentaccount.dto.cr.CurrentAccountFacility currentAccountFacility;

    public void setCurrentaccountid(String currentaccountid) {
        this.currentaccountid = currentaccountid;
    }

    public String getCurrentaccountid() {
        return currentaccountid;
    }

    public void setCurrentAccountFacility(org.museframework.bian.currentaccount.dto.cr.CurrentAccountFacility currentAccountFacility) {
        this.currentAccountFacility = currentAccountFacility;
    }

    public org.museframework.bian.currentaccount.dto.cr.CurrentAccountFacility getCurrentAccountFacility() {
        return currentAccountFacility;
    }
}