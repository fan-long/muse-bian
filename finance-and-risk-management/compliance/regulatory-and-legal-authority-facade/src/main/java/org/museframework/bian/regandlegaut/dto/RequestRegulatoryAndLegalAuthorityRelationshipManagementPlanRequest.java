package org.museframework.bian.regandlegaut.dto;

public class RequestRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest {
    private String regulatoryandlegalauthorityid;

    private org.museframework.bian.regandlegaut.dto.cr.RegulatoryAndLegalAuthorityRelationshipManagementPlan regulatoryAndLegalAuthorityRelationshipManagementPlan;

    public void setRegulatoryandlegalauthorityid(String regulatoryandlegalauthorityid) {
        this.regulatoryandlegalauthorityid = regulatoryandlegalauthorityid;
    }

    public String getRegulatoryandlegalauthorityid() {
        return regulatoryandlegalauthorityid;
    }

    public void setRegulatoryAndLegalAuthorityRelationshipManagementPlan(org.museframework.bian.regandlegaut.dto.cr.RegulatoryAndLegalAuthorityRelationshipManagementPlan regulatoryAndLegalAuthorityRelationshipManagementPlan) {
        this.regulatoryAndLegalAuthorityRelationshipManagementPlan = regulatoryAndLegalAuthorityRelationshipManagementPlan;
    }

    public org.museframework.bian.regandlegaut.dto.cr.RegulatoryAndLegalAuthorityRelationshipManagementPlan getRegulatoryAndLegalAuthorityRelationshipManagementPlan() {
        return regulatoryAndLegalAuthorityRelationshipManagementPlan;
    }
}