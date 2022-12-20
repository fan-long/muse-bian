package org.museframework.bian.creditfacility.dto;

public class RetrieveRestructuringRequest {
    private String creditfacilityid;

    private String restructuringid;

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
}