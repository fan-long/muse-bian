package org.museframework.bian.parrefdatdir.dto;

public class RetrieveDemographicsRequest {
    private String partyreferencedatadirectoryid;

    private String demographicsid;

    public void setPartyreferencedatadirectoryid(String partyreferencedatadirectoryid) {
        this.partyreferencedatadirectoryid = partyreferencedatadirectoryid;
    }

    public String getPartyreferencedatadirectoryid() {
        return partyreferencedatadirectoryid;
    }

    public void setDemographicsid(String demographicsid) {
        this.demographicsid = demographicsid;
    }

    public String getDemographicsid() {
        return demographicsid;
    }
}