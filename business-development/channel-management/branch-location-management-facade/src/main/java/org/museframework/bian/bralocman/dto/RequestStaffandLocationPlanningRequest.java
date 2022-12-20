package org.museframework.bian.bralocman.dto;

public class RequestStaffandLocationPlanningRequest {
    private String branchlocationmanagementid;

    private String staffandlocationplanningid;

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