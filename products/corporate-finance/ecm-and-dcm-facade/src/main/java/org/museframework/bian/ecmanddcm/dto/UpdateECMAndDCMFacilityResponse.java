package org.museframework.bian.ecmanddcm.dto;

public class UpdateECMAndDCMFacilityResponse {
    private org.museframework.bian.ecmanddcm.dto.cr.ECMAndDCMFacility eCMAndDCMFacility;

    public void seteCMAndDCMFacility(org.museframework.bian.ecmanddcm.dto.cr.ECMAndDCMFacility eCMAndDCMFacility) {
        this.eCMAndDCMFacility = eCMAndDCMFacility;
    }

    public org.museframework.bian.ecmanddcm.dto.cr.ECMAndDCMFacility geteCMAndDCMFacility() {
        return eCMAndDCMFacility;
    }
}