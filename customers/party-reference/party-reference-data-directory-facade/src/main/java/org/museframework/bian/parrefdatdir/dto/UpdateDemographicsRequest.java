package org.museframework.bian.parrefdatdir.dto;

public class UpdateDemographicsRequest {
    private String partyreferencedatadirectoryid;

    private String demographicsid;

    private org.museframework.bian.parrefdatdir.dto.bq.Demographics demographics;

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

    public void setDemographics(org.museframework.bian.parrefdatdir.dto.bq.Demographics demographics) {
        this.demographics = demographics;
    }

    public org.museframework.bian.parrefdatdir.dto.bq.Demographics getDemographics() {
        return demographics;
    }
}