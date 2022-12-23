package org.museframework.bian.corbanrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ControlCorrepondentBankRelationshipManagementPlanRequest {
    @MetaField
    private String correspondentbankrelationshipmanagementid;

    @MetaField(ref=true)
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