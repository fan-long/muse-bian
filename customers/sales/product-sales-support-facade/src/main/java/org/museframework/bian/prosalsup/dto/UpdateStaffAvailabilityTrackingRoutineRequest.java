package org.museframework.bian.prosalsup.dto;

public class UpdateStaffAvailabilityTrackingRoutineRequest {
    private String productsalessupportid;

    private String staffavailabilitytrackingroutineid;

    private org.museframework.bian.prosalsup.dto.bq.StaffAvailabilityTrackingRoutine staffAvailabilityTrackingRoutine;

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

    public void setStaffAvailabilityTrackingRoutine(org.museframework.bian.prosalsup.dto.bq.StaffAvailabilityTrackingRoutine staffAvailabilityTrackingRoutine) {
        this.staffAvailabilityTrackingRoutine = staffAvailabilityTrackingRoutine;
    }

    public org.museframework.bian.prosalsup.dto.bq.StaffAvailabilityTrackingRoutine getStaffAvailabilityTrackingRoutine() {
        return staffAvailabilityTrackingRoutine;
    }
}