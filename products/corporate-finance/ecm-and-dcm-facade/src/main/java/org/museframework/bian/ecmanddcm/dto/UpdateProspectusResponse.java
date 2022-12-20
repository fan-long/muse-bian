package org.museframework.bian.ecmanddcm.dto;

public class UpdateProspectusResponse {
    private org.museframework.bian.ecmanddcm.dto.bq.Prospectus prospectus;

    public void setProspectus(org.museframework.bian.ecmanddcm.dto.bq.Prospectus prospectus) {
        this.prospectus = prospectus;
    }

    public org.museframework.bian.ecmanddcm.dto.bq.Prospectus getProspectus() {
        return prospectus;
    }
}