package org.museframework.bian.proinvdis.dto;

public class RetrieveOversightResponse {
    private org.museframework.bian.proinvdis.dto.bq.Oversight oversight;

    public void setOversight(org.museframework.bian.proinvdis.dto.bq.Oversight oversight) {
        this.oversight = oversight;
    }

    public org.museframework.bian.proinvdis.dto.bq.Oversight getOversight() {
        return oversight;
    }
}