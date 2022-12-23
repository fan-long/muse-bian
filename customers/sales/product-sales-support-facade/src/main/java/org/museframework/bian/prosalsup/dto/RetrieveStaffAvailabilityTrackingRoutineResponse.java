package org.museframework.bian.prosalsup.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveStaffAvailabilityTrackingRoutineResponse {
    @MetaField(ref=true)
    private org.museframework.bian.prosalsup.dto.bq.StaffAvailabilityTrackingRoutine staffAvailabilityTrackingRoutine;

    public void setStaffAvailabilityTrackingRoutine(org.museframework.bian.prosalsup.dto.bq.StaffAvailabilityTrackingRoutine staffAvailabilityTrackingRoutine) {
        this.staffAvailabilityTrackingRoutine = staffAvailabilityTrackingRoutine;
    }

    public org.museframework.bian.prosalsup.dto.bq.StaffAvailabilityTrackingRoutine getStaffAvailabilityTrackingRoutine() {
        return staffAvailabilityTrackingRoutine;
    }
}