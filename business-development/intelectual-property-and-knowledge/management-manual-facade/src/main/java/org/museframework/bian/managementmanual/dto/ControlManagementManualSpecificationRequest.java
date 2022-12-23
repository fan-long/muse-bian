package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ControlManagementManualSpecificationRequest {
    @MetaField
    private String managementmanualid;

    @MetaField(ref=true)
    private org.museframework.bian.managementmanual.dto.cr.ManagementManualSpecification managementManualSpecification;

    public void setManagementmanualid(String managementmanualid) {
        this.managementmanualid = managementmanualid;
    }

    public String getManagementmanualid() {
        return managementmanualid;
    }

    public void setManagementManualSpecification(org.museframework.bian.managementmanual.dto.cr.ManagementManualSpecification managementManualSpecification) {
        this.managementManualSpecification = managementManualSpecification;
    }

    public org.museframework.bian.managementmanual.dto.cr.ManagementManualSpecification getManagementManualSpecification() {
        return managementManualSpecification;
    }
}