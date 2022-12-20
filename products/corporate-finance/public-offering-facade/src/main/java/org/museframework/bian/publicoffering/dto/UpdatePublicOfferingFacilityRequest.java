package org.museframework.bian.publicoffering.dto;

public class UpdatePublicOfferingFacilityRequest {
    private String publicofferingid;

    private org.museframework.bian.publicoffering.dto.cr.PublicOfferingFacility publicOfferingFacility;

    public void setPublicofferingid(String publicofferingid) {
        this.publicofferingid = publicofferingid;
    }

    public String getPublicofferingid() {
        return publicofferingid;
    }

    public void setPublicOfferingFacility(org.museframework.bian.publicoffering.dto.cr.PublicOfferingFacility publicOfferingFacility) {
        this.publicOfferingFacility = publicOfferingFacility;
    }

    public org.museframework.bian.publicoffering.dto.cr.PublicOfferingFacility getPublicOfferingFacility() {
        return publicOfferingFacility;
    }
}