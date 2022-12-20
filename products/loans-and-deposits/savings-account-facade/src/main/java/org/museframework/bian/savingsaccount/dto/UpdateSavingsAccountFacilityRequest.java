package org.museframework.bian.savingsaccount.dto;

public class UpdateSavingsAccountFacilityRequest {
    private String savingsaccountid;

    private org.museframework.bian.savingsaccount.dto.cr.SavingsAccountFacility savingsAccountFacility;

    public void setSavingsaccountid(String savingsaccountid) {
        this.savingsaccountid = savingsaccountid;
    }

    public String getSavingsaccountid() {
        return savingsaccountid;
    }

    public void setSavingsAccountFacility(org.museframework.bian.savingsaccount.dto.cr.SavingsAccountFacility savingsAccountFacility) {
        this.savingsAccountFacility = savingsAccountFacility;
    }

    public org.museframework.bian.savingsaccount.dto.cr.SavingsAccountFacility getSavingsAccountFacility() {
        return savingsAccountFacility;
    }
}