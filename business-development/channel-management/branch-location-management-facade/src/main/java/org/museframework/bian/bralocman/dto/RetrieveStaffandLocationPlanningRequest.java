package org.museframework.bian.bralocman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveStaffandLocationPlanningRequest {
    @MetaField
    private String branchlocationmanagementid;

    @MetaField
    private String staffandlocationplanningid;

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
}