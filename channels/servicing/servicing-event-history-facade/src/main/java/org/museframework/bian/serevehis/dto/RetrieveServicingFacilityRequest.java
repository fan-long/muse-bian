package org.museframework.bian.serevehis.dto;

public class RetrieveServicingFacilityRequest {
    private String servicingeventhistoryid;

    private String servicingfacilityid;

    public void setServicingeventhistoryid(String servicingeventhistoryid) {
        this.servicingeventhistoryid = servicingeventhistoryid;
    }

    public String getServicingeventhistoryid() {
        return servicingeventhistoryid;
    }

    public void setServicingfacilityid(String servicingfacilityid) {
        this.servicingfacilityid = servicingfacilityid;
    }

    public String getServicingfacilityid() {
        return servicingfacilityid;
    }
}