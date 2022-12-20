package org.museframework.bian.pubrefdatman.dto;

public class InitiateGlobalReferenceDataRequest {
    private String publicreferencedatamanagementid;

    private String globalreferencedataid;

    private org.museframework.bian.pubrefdatman.dto.bq.GlobalReferenceData globalReferenceData;

    public void setPublicreferencedatamanagementid(String publicreferencedatamanagementid) {
        this.publicreferencedatamanagementid = publicreferencedatamanagementid;
    }

    public String getPublicreferencedatamanagementid() {
        return publicreferencedatamanagementid;
    }

    public void setGlobalreferencedataid(String globalreferencedataid) {
        this.globalreferencedataid = globalreferencedataid;
    }

    public String getGlobalreferencedataid() {
        return globalreferencedataid;
    }

    public void setGlobalReferenceData(org.museframework.bian.pubrefdatman.dto.bq.GlobalReferenceData globalReferenceData) {
        this.globalReferenceData = globalReferenceData;
    }

    public org.museframework.bian.pubrefdatman.dto.bq.GlobalReferenceData getGlobalReferenceData() {
        return globalReferenceData;
    }
}