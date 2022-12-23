package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateStaffManagementProceduresandGuidelinesRequest {
    @MetaField
    private String managementmanualid;

    @MetaField
    private String staffmanagementproceduresandguidelinesid;

    @MetaField(ref=true)
    private org.museframework.bian.managementmanual.dto.bq.StaffManagementProceduresandGuidelines staffManagementProceduresandGuidelines;

    public void setManagementmanualid(String managementmanualid) {
        this.managementmanualid = managementmanualid;
    }

    public String getManagementmanualid() {
        return managementmanualid;
    }

    public void setStaffmanagementproceduresandguidelinesid(String staffmanagementproceduresandguidelinesid) {
        this.staffmanagementproceduresandguidelinesid = staffmanagementproceduresandguidelinesid;
    }

    public String getStaffmanagementproceduresandguidelinesid() {
        return staffmanagementproceduresandguidelinesid;
    }

    public void setStaffManagementProceduresandGuidelines(org.museframework.bian.managementmanual.dto.bq.StaffManagementProceduresandGuidelines staffManagementProceduresandGuidelines) {
        this.staffManagementProceduresandGuidelines = staffManagementProceduresandGuidelines;
    }

    public org.museframework.bian.managementmanual.dto.bq.StaffManagementProceduresandGuidelines getStaffManagementProceduresandGuidelines() {
        return staffManagementProceduresandGuidelines;
    }
}