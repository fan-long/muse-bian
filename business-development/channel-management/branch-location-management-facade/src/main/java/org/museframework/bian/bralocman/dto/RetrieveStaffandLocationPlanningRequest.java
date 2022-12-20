package org.museframework.bian.bralocman.dto;

public class RetrieveStaffandLocationPlanningRequest {
    private String branchlocationmanagementid;

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