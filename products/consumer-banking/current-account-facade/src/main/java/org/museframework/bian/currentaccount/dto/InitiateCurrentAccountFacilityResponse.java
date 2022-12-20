package org.museframework.bian.currentaccount.dto;

public class InitiateCurrentAccountFacilityResponse {
    private org.museframework.bian.currentaccount.dto.cr.CurrentAccountFacility currentAccountFacility;

    public void setCurrentAccountFacility(org.museframework.bian.currentaccount.dto.cr.CurrentAccountFacility currentAccountFacility) {
        this.currentAccountFacility = currentAccountFacility;
    }

    public org.museframework.bian.currentaccount.dto.cr.CurrentAccountFacility getCurrentAccountFacility() {
        return currentAccountFacility;
    }
}