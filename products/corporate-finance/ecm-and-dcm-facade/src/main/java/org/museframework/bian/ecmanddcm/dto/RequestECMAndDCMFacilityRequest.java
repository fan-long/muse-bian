package org.museframework.bian.ecmanddcm.dto;

public class RequestECMAndDCMFacilityRequest {
    private String ecmanddcmid;

    private org.museframework.bian.ecmanddcm.dto.cr.ECMAndDCMFacility eCMAndDCMFacility;

    public void setEcmanddcmid(String ecmanddcmid) {
        this.ecmanddcmid = ecmanddcmid;
    }

    public String getEcmanddcmid() {
        return ecmanddcmid;
    }

    public void seteCMAndDCMFacility(org.museframework.bian.ecmanddcm.dto.cr.ECMAndDCMFacility eCMAndDCMFacility) {
        this.eCMAndDCMFacility = eCMAndDCMFacility;
    }

    public org.museframework.bian.ecmanddcm.dto.cr.ECMAndDCMFacility geteCMAndDCMFacility() {
        return eCMAndDCMFacility;
    }
}