package org.museframework.bian.corporatetreasury.dto;

public class UpdateCorporateTreasuryManagementPlanRequest {
    private String corporatetreasuryid;

    private org.museframework.bian.corporatetreasury.dto.cr.CorporateTreasuryManagementPlan corporateTreasuryManagementPlan;

    public void setCorporatetreasuryid(String corporatetreasuryid) {
        this.corporatetreasuryid = corporatetreasuryid;
    }

    public String getCorporatetreasuryid() {
        return corporatetreasuryid;
    }

    public void setCorporateTreasuryManagementPlan(org.museframework.bian.corporatetreasury.dto.cr.CorporateTreasuryManagementPlan corporateTreasuryManagementPlan) {
        this.corporateTreasuryManagementPlan = corporateTreasuryManagementPlan;
    }

    public org.museframework.bian.corporatetreasury.dto.cr.CorporateTreasuryManagementPlan getCorporateTreasuryManagementPlan() {
        return corporateTreasuryManagementPlan;
    }
}