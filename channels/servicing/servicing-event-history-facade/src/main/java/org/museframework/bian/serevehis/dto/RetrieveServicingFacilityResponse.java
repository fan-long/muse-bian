package org.museframework.bian.serevehis.dto;

public class RetrieveServicingFacilityResponse {
    private org.museframework.bian.serevehis.dto.bq.ServicingFacility servicingFacility;

    public void setServicingFacility(org.museframework.bian.serevehis.dto.bq.ServicingFacility servicingFacility) {
        this.servicingFacility = servicingFacility;
    }

    public org.museframework.bian.serevehis.dto.bq.ServicingFacility getServicingFacility() {
        return servicingFacility;
    }
}