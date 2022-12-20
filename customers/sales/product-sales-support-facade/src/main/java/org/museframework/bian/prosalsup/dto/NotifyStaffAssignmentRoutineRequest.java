package org.museframework.bian.prosalsup.dto;

public class NotifyStaffAssignmentRoutineRequest {
    private String productsalessupportid;

    private String staffassignmentroutineid;

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
}