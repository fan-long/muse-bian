package org.museframework.bian.parrefdatdir.dto;

public class RetrieveReferenceRequest {
    private String partyreferencedatadirectoryid;

    private String referenceid;

    public void setPartyreferencedatadirectoryid(String partyreferencedatadirectoryid) {
        this.partyreferencedatadirectoryid = partyreferencedatadirectoryid;
    }

    public String getPartyreferencedatadirectoryid() {
        return partyreferencedatadirectoryid;
    }

    public void setReferenceid(String referenceid) {
        this.referenceid = referenceid;
    }

    public String getReferenceid() {
        return referenceid;
    }
}