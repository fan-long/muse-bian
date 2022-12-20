package org.museframework.bian.parrefdatdir.dto;

public class UpdateReferenceRequest {
    private String partyreferencedatadirectoryid;

    private String referenceid;

    private org.museframework.bian.parrefdatdir.dto.bq.Reference reference;

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

    public void setReference(org.museframework.bian.parrefdatdir.dto.bq.Reference reference) {
        this.reference = reference;
    }

    public org.museframework.bian.parrefdatdir.dto.bq.Reference getReference() {
        return reference;
    }
}