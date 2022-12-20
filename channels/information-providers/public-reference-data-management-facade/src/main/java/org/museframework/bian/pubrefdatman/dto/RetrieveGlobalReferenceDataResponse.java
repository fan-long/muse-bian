package org.museframework.bian.pubrefdatman.dto;

public class RetrieveGlobalReferenceDataResponse {
    private org.museframework.bian.pubrefdatman.dto.bq.GlobalReferenceData globalReferenceData;

    public void setGlobalReferenceData(org.museframework.bian.pubrefdatman.dto.bq.GlobalReferenceData globalReferenceData) {
        this.globalReferenceData = globalReferenceData;
    }

    public org.museframework.bian.pubrefdatman.dto.bq.GlobalReferenceData getGlobalReferenceData() {
        return globalReferenceData;
    }
}