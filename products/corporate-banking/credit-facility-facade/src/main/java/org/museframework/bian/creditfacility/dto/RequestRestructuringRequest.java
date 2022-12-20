package org.museframework.bian.creditfacility.dto;

public class RequestRestructuringRequest {
    private String creditfacilityid;

    private String restructuringid;

    private org.museframework.bian.creditfacility.dto.bq.Restructuring restructuring;

    public void setCreditfacilityid(String creditfacilityid) {
        this.creditfacilityid = creditfacilityid;
    }

    public String getCreditfacilityid() {
        return creditfacilityid;
    }

    public void setRestructuringid(String restructuringid) {
        this.restructuringid = restructuringid;
    }

    public String getRestructuringid() {
        return restructuringid;
    }

    public void setRestructuring(org.museframework.bian.creditfacility.dto.bq.Restructuring restructuring) {
        this.restructuring = restructuring;
    }

    public org.museframework.bian.creditfacility.dto.bq.Restructuring getRestructuring() {
        return restructuring;
    }
}