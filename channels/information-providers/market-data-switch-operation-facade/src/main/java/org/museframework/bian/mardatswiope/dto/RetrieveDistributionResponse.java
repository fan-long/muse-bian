package org.museframework.bian.mardatswiope.dto;

public class RetrieveDistributionResponse {
    private org.museframework.bian.mardatswiope.dto.bq.Distribution distribution;

    public void setDistribution(org.museframework.bian.mardatswiope.dto.bq.Distribution distribution) {
        this.distribution = distribution;
    }

    public org.museframework.bian.mardatswiope.dto.bq.Distribution getDistribution() {
        return distribution;
    }
}