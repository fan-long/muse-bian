package org.museframework.bian.serevehis.dto;

public class UpdateServicingFacilityRequest {
    private String servicingeventhistoryid;

    private String servicingfacilityid;

    private org.museframework.bian.serevehis.dto.bq.ServicingFacility servicingFacility;

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

    public void setServicingFacility(org.museframework.bian.serevehis.dto.bq.ServicingFacility servicingFacility) {
        this.servicingFacility = servicingFacility;
    }

    public org.museframework.bian.serevehis.dto.bq.ServicingFacility getServicingFacility() {
        return servicingFacility;
    }
}