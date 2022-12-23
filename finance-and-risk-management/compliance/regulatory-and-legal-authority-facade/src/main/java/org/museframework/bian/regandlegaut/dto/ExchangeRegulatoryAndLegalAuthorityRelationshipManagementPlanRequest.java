package org.museframework.bian.regandlegaut.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeRegulatoryAndLegalAuthorityRelationshipManagementPlanRequest {
    @MetaField
    private String regulatoryandlegalauthorityid;

    @MetaField(ref=true)
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