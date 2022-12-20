package org.museframework.bian.concenope.dto;

public class RetrievePeakLoadResponse {
    private org.museframework.bian.concenope.dto.bq.PeakLoad peakLoad;

    public void setPeakLoad(org.museframework.bian.concenope.dto.bq.PeakLoad peakLoad) {
        this.peakLoad = peakLoad;
    }

    public org.museframework.bian.concenope.dto.bq.PeakLoad getPeakLoad() {
        return peakLoad;
    }
}