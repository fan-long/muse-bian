package org.museframework.bian.accountsreceivable.dto;

public class RetrieveResolutionResponse {
    private org.museframework.bian.accountsreceivable.dto.bq.Resolution resolution;

    public void setResolution(org.museframework.bian.accountsreceivable.dto.bq.Resolution resolution) {
        this.resolution = resolution;
    }

    public org.museframework.bian.accountsreceivable.dto.bq.Resolution getResolution() {
        return resolution;
    }
}