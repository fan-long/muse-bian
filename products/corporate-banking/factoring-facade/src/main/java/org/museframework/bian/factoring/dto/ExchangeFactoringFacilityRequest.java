package org.museframework.bian.factoring.dto;

public class ExchangeFactoringFacilityRequest {
    private String factoringid;

    private org.museframework.bian.factoring.dto.cr.FactoringFacility factoringFacility;

    public void setFactoringid(String factoringid) {
        this.factoringid = factoringid;
    }

    public String getFactoringid() {
        return factoringid;
    }

    public void setFactoringFacility(org.museframework.bian.factoring.dto.cr.FactoringFacility factoringFacility) {
        this.factoringFacility = factoringFacility;
    }

    public org.museframework.bian.factoring.dto.cr.FactoringFacility getFactoringFacility() {
        return factoringFacility;
    }
}