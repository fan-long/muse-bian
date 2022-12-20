package org.museframework.bian.legentdir.dto;

public class UpdateReferenceRequest {
    private String legalentitydirectoryid;

    private String referenceid;

    private org.museframework.bian.legentdir.dto.bq.Reference reference;

    public void setLegalentitydirectoryid(String legalentitydirectoryid) {
        this.legalentitydirectoryid = legalentitydirectoryid;
    }

    public String getLegalentitydirectoryid() {
        return legalentitydirectoryid;
    }

    public void setReferenceid(String referenceid) {
        this.referenceid = referenceid;
    }

    public String getReferenceid() {
        return referenceid;
    }

    public void setReference(org.museframework.bian.legentdir.dto.bq.Reference reference) {
        this.reference = reference;
    }

    public org.museframework.bian.legentdir.dto.bq.Reference getReference() {
        return reference;
    }
}