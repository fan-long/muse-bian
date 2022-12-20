package org.museframework.bian.publicoffering.dto;

public class UpdatePublicOfferingFacilityResponse {
    private org.museframework.bian.publicoffering.dto.cr.PublicOfferingFacility publicOfferingFacility;

    public void setPublicOfferingFacility(org.museframework.bian.publicoffering.dto.cr.PublicOfferingFacility publicOfferingFacility) {
        this.publicOfferingFacility = publicOfferingFacility;
    }

    public org.museframework.bian.publicoffering.dto.cr.PublicOfferingFacility getPublicOfferingFacility() {
        return publicOfferingFacility;
    }
}