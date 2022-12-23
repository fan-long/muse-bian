package org.museframework.bian.prosalsup.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateStaffAssignmentRoutineResponse {
    @MetaField(ref=true)
    private org.museframework.bian.prosalsup.dto.bq.StaffAssignmentRoutine staffAssignmentRoutine;

    public void setStaffAssignmentRoutine(org.museframework.bian.prosalsup.dto.bq.StaffAssignmentRoutine staffAssignmentRoutine) {
        this.staffAssignmentRoutine = staffAssignmentRoutine;
    }

    public org.museframework.bian.prosalsup.dto.bq.StaffAssignmentRoutine getStaffAssignmentRoutine() {
        return staffAssignmentRoutine;
    }
}