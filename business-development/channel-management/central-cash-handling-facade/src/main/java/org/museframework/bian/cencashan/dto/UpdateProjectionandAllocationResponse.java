package org.museframework.bian.cencashan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateProjectionandAllocationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cencashan.dto.bq.ProjectionandAllocation projectionandAllocation;

    public void setProjectionandAllocation(org.museframework.bian.cencashan.dto.bq.ProjectionandAllocation projectionandAllocation) {
        this.projectionandAllocation = projectionandAllocation;
    }

    public org.museframework.bian.cencashan.dto.bq.ProjectionandAllocation getProjectionandAllocation() {
        return projectionandAllocation;
    }
}