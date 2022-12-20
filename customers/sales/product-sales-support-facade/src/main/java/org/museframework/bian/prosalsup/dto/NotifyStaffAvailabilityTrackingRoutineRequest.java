package org.museframework.bian.prosalsup.dto;

public class NotifyStaffAvailabilityTrackingRoutineRequest {
    private String productsalessupportid;

    private String staffavailabilitytrackingroutineid;

    public void setProductsalessupportid(String productsalessupportid) {
        this.productsalessupportid = productsalessupportid;
    }

    public String getProductsalessupportid() {
        return productsalessupportid;
    }

    public void setStaffavailabilitytrackingroutineid(String staffavailabilitytrackingroutineid) {
        this.staffavailabilitytrackingroutineid = staffavailabilitytrackingroutineid;
    }

    public String getStaffavailabilitytrackingroutineid() {
        return staffavailabilitytrackingroutineid;
    }
}