package org.museframework.bian.currentaccount.dto;

public class InitiateCurrentAccountFacilityRequest {
    private org.museframework.bian.currentaccount.dto.cr.CurrentAccountFacility currentAccountFacility;

    public void setCurrentAccountFacility(org.museframework.bian.currentaccount.dto.cr.CurrentAccountFacility currentAccountFacility) {
        this.currentAccountFacility = currentAccountFacility;
    }

    public org.museframework.bian.currentaccount.dto.cr.CurrentAccountFacility getCurrentAccountFacility() {
        return currentAccountFacility;
    }
}