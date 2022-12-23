package org.museframework.bian.bralocman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureStaffandLocationPlanningRequest {
    @MetaField
    private String branchlocationmanagementid;

    @MetaField
    private String staffandlocationplanningid;

    @MetaField(ref=true)
    private org.museframework.bian.bralocman.dto.bq.StaffandLocationPlanning staffandLocationPlanning;

    public void setBranchlocationmanagementid(String branchlocationmanagementid) {
        this.branchlocationmanagementid = branchlocationmanagementid;
    }

    public String getBranchlocationmanagementid() {
        return branchlocationmanagementid;
    }

    public void setStaffandlocationplanningid(String staffandlocationplanningid) {
        this.staffandlocationplanningid = staffandlocationplanningid;
    }

    public String getStaffandlocationplanningid() {
        return staffandlocationplanningid;
    }

    public void setStaffandLocationPlanning(org.museframework.bian.bralocman.dto.bq.StaffandLocationPlanning staffandLocationPlanning) {
        this.staffandLocationPlanning = staffandLocationPlanning;
    }

    public org.museframework.bian.bralocman.dto.bq.StaffandLocationPlanning getStaffandLocationPlanning() {
        return staffandLocationPlanning;
    }
}