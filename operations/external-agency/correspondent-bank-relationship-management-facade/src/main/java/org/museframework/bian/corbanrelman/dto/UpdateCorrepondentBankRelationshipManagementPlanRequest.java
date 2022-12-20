package org.museframework.bian.corbanrelman.dto;

public class UpdateCorrepondentBankRelationshipManagementPlanRequest {
    private String correspondentbankrelationshipmanagementid;

    private org.museframework.bian.corbanrelman.dto.cr.CorrepondentBankRelationshipManagementPlan correpondentBankRelationshipManagementPlan;

    public void setCorrespondentbankrelationshipmanagementid(String correspondentbankrelationshipmanagementid) {
        this.correspondentbankrelationshipmanagementid = correspondentbankrelationshipmanagementid;
    }

    public String getCorrespondentbankrelationshipmanagementid() {
        return correspondentbankrelationshipmanagementid;
    }

    public void setCorrepondentBankRelationshipManagementPlan(org.museframework.bian.corbanrelman.dto.cr.CorrepondentBankRelationshipManagementPlan correpondentBankRelationshipManagementPlan) {
        this.correpondentBankRelationshipManagementPlan = correpondentBankRelationshipManagementPlan;
    }

    public org.museframework.bian.corbanrelman.dto.cr.CorrepondentBankRelationshipManagementPlan getCorrepondentBankRelationshipManagementPlan() {
        return correpondentBankRelationshipManagementPlan;
    }
}