package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveStaffManagementProceduresandGuidelinesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.managementmanual.dto.bq.StaffManagementProceduresandGuidelines staffManagementProceduresandGuidelines;

    public void setStaffManagementProceduresandGuidelines(org.museframework.bian.managementmanual.dto.bq.StaffManagementProceduresandGuidelines staffManagementProceduresandGuidelines) {
        this.staffManagementProceduresandGuidelines = staffManagementProceduresandGuidelines;
    }

    public org.museframework.bian.managementmanual.dto.bq.StaffManagementProceduresandGuidelines getStaffManagementProceduresandGuidelines() {
        return staffManagementProceduresandGuidelines;
    }
}