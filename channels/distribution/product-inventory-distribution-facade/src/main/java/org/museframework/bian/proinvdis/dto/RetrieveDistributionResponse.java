package org.museframework.bian.proinvdis.dto;

public class RetrieveDistributionResponse {
    private org.museframework.bian.proinvdis.dto.bq.Distribution distribution;

    public void setDistribution(org.museframework.bian.proinvdis.dto.bq.Distribution distribution) {
        this.distribution = distribution;
    }

    public org.museframework.bian.proinvdis.dto.bq.Distribution getDistribution() {
        return distribution;
    }
}