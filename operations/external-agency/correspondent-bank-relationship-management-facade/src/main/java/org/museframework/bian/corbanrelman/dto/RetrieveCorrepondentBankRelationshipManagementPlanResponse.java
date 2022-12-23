package org.museframework.bian.corbanrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCorrepondentBankRelationshipManagementPlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corbanrelman.dto.cr.CorrepondentBankRelationshipManagementPlan correpondentBankRelationshipManagementPlan;

    public void setCorrepondentBankRelationshipManagementPlan(org.museframework.bian.corbanrelman.dto.cr.CorrepondentBankRelationshipManagementPlan correpondentBankRelationshipManagementPlan) {
        this.correpondentBankRelationshipManagementPlan = correpondentBankRelationshipManagementPlan;
    }

    public org.museframework.bian.corbanrelman.dto.cr.CorrepondentBankRelationshipManagementPlan getCorrepondentBankRelationshipManagementPlan() {
        return correpondentBankRelationshipManagementPlan;
    }
}