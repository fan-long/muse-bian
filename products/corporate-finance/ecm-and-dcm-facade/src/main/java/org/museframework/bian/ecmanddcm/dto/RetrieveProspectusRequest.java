package org.museframework.bian.ecmanddcm.dto;

public class RetrieveProspectusRequest {
    private String ecmanddcmid;

    private String prospectusid;

    public void setEcmanddcmid(String ecmanddcmid) {
        this.ecmanddcmid = ecmanddcmid;
    }

    public String getEcmanddcmid() {
        return ecmanddcmid;
    }

    public void setProspectusid(String prospectusid) {
        this.prospectusid = prospectusid;
    }

    public String getProspectusid() {
        return prospectusid;
    }
}