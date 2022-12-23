package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveManagementManualSpecificationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.managementmanual.dto.cr.ManagementManualSpecification managementManualSpecification;

    public void setManagementManualSpecification(org.museframework.bian.managementmanual.dto.cr.ManagementManualSpecification managementManualSpecification) {
        this.managementManualSpecification = managementManualSpecification;
    }

    public org.museframework.bian.managementmanual.dto.cr.ManagementManualSpecification getManagementManualSpecification() {
        return managementManualSpecification;
    }
}