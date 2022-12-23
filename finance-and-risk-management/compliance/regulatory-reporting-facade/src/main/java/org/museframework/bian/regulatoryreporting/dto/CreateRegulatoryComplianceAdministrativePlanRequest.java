package org.museframework.bian.regulatoryreporting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CreateRegulatoryComplianceAdministrativePlanRequest {
    @MetaField(ref=true)
    private org.museframework.bian.regulatoryreporting.dto.cr.RegulatoryComplianceAdministrativePlan regulatoryComplianceAdministrativePlan;

    public void setRegulatoryComplianceAdministrativePlan(org.museframework.bian.regulatoryreporting.dto.cr.RegulatoryComplianceAdministrativePlan regulatoryComplianceAdministrativePlan) {
        this.regulatoryComplianceAdministrativePlan = regulatoryComplianceAdministrativePlan;
    }

    public org.museframework.bian.regulatoryreporting.dto.cr.RegulatoryComplianceAdministrativePlan getRegulatoryComplianceAdministrativePlan() {
        return regulatoryComplianceAdministrativePlan;
    }
}