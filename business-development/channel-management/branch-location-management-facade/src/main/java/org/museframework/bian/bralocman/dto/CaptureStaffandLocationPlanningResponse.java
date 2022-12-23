package org.museframework.bian.bralocman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureStaffandLocationPlanningResponse {
    @MetaField(ref=true)
    private org.museframework.bian.bralocman.dto.bq.StaffandLocationPlanning staffandLocationPlanning;

    public void setStaffandLocationPlanning(org.museframework.bian.bralocman.dto.bq.StaffandLocationPlanning staffandLocationPlanning) {
        this.staffandLocationPlanning = staffandLocationPlanning;
    }

    public org.museframework.bian.bralocman.dto.bq.StaffandLocationPlanning getStaffandLocationPlanning() {
        return staffandLocationPlanning;
    }
}