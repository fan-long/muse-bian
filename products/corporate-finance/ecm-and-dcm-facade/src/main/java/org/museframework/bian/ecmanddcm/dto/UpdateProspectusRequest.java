package org.museframework.bian.ecmanddcm.dto;

public class UpdateProspectusRequest {
    private String ecmanddcmid;

    private String prospectusid;

    private org.museframework.bian.ecmanddcm.dto.bq.Prospectus prospectus;

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

    public void setProspectus(org.museframework.bian.ecmanddcm.dto.bq.Prospectus prospectus) {
        this.prospectus = prospectus;
    }

    public org.museframework.bian.ecmanddcm.dto.bq.Prospectus getProspectus() {
        return prospectus;
    }
}