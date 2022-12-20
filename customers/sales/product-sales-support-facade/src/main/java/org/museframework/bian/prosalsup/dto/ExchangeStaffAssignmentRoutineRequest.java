package org.museframework.bian.prosalsup.dto;

public class ExchangeStaffAssignmentRoutineRequest {
    private String productsalessupportid;

    private String staffassignmentroutineid;

    private org.museframework.bian.prosalsup.dto.bq.StaffAssignmentRoutine staffAssignmentRoutine;

    public void setProductsalessupportid(String productsalessupportid) {
        this.productsalessupportid = productsalessupportid;
    }

    public String getProductsalessupportid() {
        return productsalessupportid;
    }

    public void setStaffassignmentroutineid(String staffassignmentroutineid) {
        this.staffassignmentroutineid = staffassignmentroutineid;
    }

    public String getStaffassignmentroutineid() {
        return staffassignmentroutineid;
    }

    public void setStaffAssignmentRoutine(org.museframework.bian.prosalsup.dto.bq.StaffAssignmentRoutine staffAssignmentRoutine) {
        this.staffAssignmentRoutine = staffAssignmentRoutine;
    }

    public org.museframework.bian.prosalsup.dto.bq.StaffAssignmentRoutine getStaffAssignmentRoutine() {
        return staffAssignmentRoutine;
    }
}