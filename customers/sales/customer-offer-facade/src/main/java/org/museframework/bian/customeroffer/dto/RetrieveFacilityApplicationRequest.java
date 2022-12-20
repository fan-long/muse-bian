package org.museframework.bian.customeroffer.dto;

public class RetrieveFacilityApplicationRequest {
    private String customerofferid;

    private String facilityapplicationid;

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
}