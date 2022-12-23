package org.museframework.bian.compliancereporting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestComplianceReportingAdministrativePlanRequest {
    @MetaField
    private String compliancereportingid;

    @MetaField(ref=true)
    private org.museframework.bian.compliancereporting.dto.cr.ComplianceReportingAdministrativePlan complianceReportingAdministrativePlan;

    public void setCompliancereportingid(String compliancereportingid) {
        this.compliancereportingid = compliancereportingid;
    }

    public String getCompliancereportingid() {
        return compliancereportingid;
    }

    public void setComplianceReportingAdministrativePlan(org.museframework.bian.compliancereporting.dto.cr.ComplianceReportingAdministrativePlan complianceReportingAdministrativePlan) {
        this.complianceReportingAdministrativePlan = complianceReportingAdministrativePlan;
    }

    public org.museframework.bian.compliancereporting.dto.cr.ComplianceReportingAdministrativePlan getComplianceReportingAdministrativePlan() {
        return complianceReportingAdministrativePlan;
    }
}