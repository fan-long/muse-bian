package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveStaffManagementProceduresandGuidelinesRequest {
    @MetaField
    private String managementmanualid;

    @MetaField
    private String staffmanagementproceduresandguidelinesid;

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
}