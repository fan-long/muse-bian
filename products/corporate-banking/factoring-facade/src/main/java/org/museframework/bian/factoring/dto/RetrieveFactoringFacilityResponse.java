package org.museframework.bian.factoring.dto;

public class RetrieveFactoringFacilityResponse {
    private org.museframework.bian.factoring.dto.cr.FactoringFacility factoringFacility;

    public void setFactoringFacility(org.museframework.bian.factoring.dto.cr.FactoringFacility factoringFacility) {
        this.factoringFacility = factoringFacility;
    }

    public org.museframework.bian.factoring.dto.cr.FactoringFacility getFactoringFacility() {
        return factoringFacility;
    }
}