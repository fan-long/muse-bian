package org.museframework.bian.casmanandaccser.dto;

public class UpdateCashManagementAndAccountServicesFacilityRequest {
    private String cashmanagementandaccountservicesid;

    private org.museframework.bian.casmanandaccser.dto.cr.CashManagementAndAccountServicesFacility cashManagementAndAccountServicesFacility;

    public void setCashmanagementandaccountservicesid(String cashmanagementandaccountservicesid) {
        this.cashmanagementandaccountservicesid = cashmanagementandaccountservicesid;
    }

    public String getCashmanagementandaccountservicesid() {
        return cashmanagementandaccountservicesid;
    }

    public void setCashManagementAndAccountServicesFacility(org.museframework.bian.casmanandaccser.dto.cr.CashManagementAndAccountServicesFacility cashManagementAndAccountServicesFacility) {
        this.cashManagementAndAccountServicesFacility = cashManagementAndAccountServicesFacility;
    }

    public org.museframework.bian.casmanandaccser.dto.cr.CashManagementAndAccountServicesFacility getCashManagementAndAccountServicesFacility() {
        return cashManagementAndAccountServicesFacility;
    }
}