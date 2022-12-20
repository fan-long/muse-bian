package org.museframework.bian.intrelman.dto;

public class UpdateBankRelationshipManagementPlanRequest {
    private String interbankrelationshipmanagementid;

    private org.museframework.bian.intrelman.dto.cr.BankRelationshipManagementPlan bankRelationshipManagementPlan;

    public void setInterbankrelationshipmanagementid(String interbankrelationshipmanagementid) {
        this.interbankrelationshipmanagementid = interbankrelationshipmanagementid;
    }

    public String getInterbankrelationshipmanagementid() {
        return interbankrelationshipmanagementid;
    }

    public void setBankRelationshipManagementPlan(org.museframework.bian.intrelman.dto.cr.BankRelationshipManagementPlan bankRelationshipManagementPlan) {
        this.bankRelationshipManagementPlan = bankRelationshipManagementPlan;
    }

    public org.museframework.bian.intrelman.dto.cr.BankRelationshipManagementPlan getBankRelationshipManagementPlan() {
        return bankRelationshipManagementPlan;
    }
}