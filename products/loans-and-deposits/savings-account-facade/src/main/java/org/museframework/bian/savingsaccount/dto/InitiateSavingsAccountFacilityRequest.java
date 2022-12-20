package org.museframework.bian.savingsaccount.dto;

public class InitiateSavingsAccountFacilityRequest {
    private org.museframework.bian.savingsaccount.dto.cr.SavingsAccountFacility savingsAccountFacility;

    public void setSavingsAccountFacility(org.museframework.bian.savingsaccount.dto.cr.SavingsAccountFacility savingsAccountFacility) {
        this.savingsAccountFacility = savingsAccountFacility;
    }

    public org.museframework.bian.savingsaccount.dto.cr.SavingsAccountFacility getSavingsAccountFacility() {
        return savingsAccountFacility;
    }
}