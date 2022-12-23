package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureEmploymentRelatedProceduresandGuidelinesRequest {
    @MetaField
    private String managementmanualid;

    @MetaField
    private String employmentrelatedproceduresandguidelinesid;

    @MetaField(ref=true)
    private org.museframework.bian.managementmanual.dto.bq.EmploymentRelatedProceduresandGuidelines employmentRelatedProceduresandGuidelines;

    public void setManagementmanualid(String managementmanualid) {
        this.managementmanualid = managementmanualid;
    }

    public String getManagementmanualid() {
        return managementmanualid;
    }

    public void setEmploymentrelatedproceduresandguidelinesid(String employmentrelatedproceduresandguidelinesid) {
        this.employmentrelatedproceduresandguidelinesid = employmentrelatedproceduresandguidelinesid;
    }

    public String getEmploymentrelatedproceduresandguidelinesid() {
        return employmentrelatedproceduresandguidelinesid;
    }

    public void setEmploymentRelatedProceduresandGuidelines(org.museframework.bian.managementmanual.dto.bq.EmploymentRelatedProceduresandGuidelines employmentRelatedProceduresandGuidelines) {
        this.employmentRelatedProceduresandGuidelines = employmentRelatedProceduresandGuidelines;
    }

    public org.museframework.bian.managementmanual.dto.bq.EmploymentRelatedProceduresandGuidelines getEmploymentRelatedProceduresandGuidelines() {
        return employmentRelatedProceduresandGuidelines;
    }
}