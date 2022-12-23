package org.museframework.bian.regandlegaut.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class GrantRegulatoryAndLegalAuthorityRelationshipManagementPlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.regandlegaut.dto.cr.RegulatoryAndLegalAuthorityRelationshipManagementPlan regulatoryAndLegalAuthorityRelationshipManagementPlan;

    public void setRegulatoryAndLegalAuthorityRelationshipManagementPlan(org.museframework.bian.regandlegaut.dto.cr.RegulatoryAndLegalAuthorityRelationshipManagementPlan regulatoryAndLegalAuthorityRelationshipManagementPlan) {
        this.regulatoryAndLegalAuthorityRelationshipManagementPlan = regulatoryAndLegalAuthorityRelationshipManagementPlan;
    }

    public org.museframework.bian.regandlegaut.dto.cr.RegulatoryAndLegalAuthorityRelationshipManagementPlan getRegulatoryAndLegalAuthorityRelationshipManagementPlan() {
        return regulatoryAndLegalAuthorityRelationshipManagementPlan;
    }
}