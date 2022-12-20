package org.museframework.bian.customeroffer.dto;

public class UpdateFacilityApplicationResponse {
    private org.museframework.bian.customeroffer.dto.bq.FacilityApplication facilityApplication;

    public void setFacilityApplication(org.museframework.bian.customeroffer.dto.bq.FacilityApplication facilityApplication) {
        this.facilityApplication = facilityApplication;
    }

    public org.museframework.bian.customeroffer.dto.bq.FacilityApplication getFacilityApplication() {
        return facilityApplication;
    }
}