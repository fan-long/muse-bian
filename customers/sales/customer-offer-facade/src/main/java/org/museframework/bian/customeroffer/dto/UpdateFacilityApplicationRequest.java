package org.museframework.bian.customeroffer.dto;

public class UpdateFacilityApplicationRequest {
    private String customerofferid;

    private String facilityapplicationid;

    private org.museframework.bian.customeroffer.dto.bq.FacilityApplication facilityApplication;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setFacilityapplicationid(String facilityapplicationid) {
        this.facilityapplicationid = facilityapplicationid;
    }

    public String getFacilityapplicationid() {
        return facilityapplicationid;
    }

    public void setFacilityApplication(org.museframework.bian.customeroffer.dto.bq.FacilityApplication facilityApplication) {
        this.facilityApplication = facilityApplication;
    }

    public org.museframework.bian.customeroffer.dto.bq.FacilityApplication getFacilityApplication() {
        return facilityApplication;
    }
}