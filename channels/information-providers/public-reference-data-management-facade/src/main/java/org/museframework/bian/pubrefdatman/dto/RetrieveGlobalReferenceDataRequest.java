package org.museframework.bian.pubrefdatman.dto;

public class RetrieveGlobalReferenceDataRequest {
    private String publicreferencedatamanagementid;

    private String globalreferencedataid;

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
}