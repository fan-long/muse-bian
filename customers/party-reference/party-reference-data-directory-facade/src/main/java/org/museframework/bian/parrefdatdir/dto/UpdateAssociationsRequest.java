package org.museframework.bian.parrefdatdir.dto;

public class UpdateAssociationsRequest {
    private String partyreferencedatadirectoryid;

    private String associationsid;

    private org.museframework.bian.parrefdatdir.dto.bq.Associations associations;

    public void setPartyreferencedatadirectoryid(String partyreferencedatadirectoryid) {
        this.partyreferencedatadirectoryid = partyreferencedatadirectoryid;
    }

    public String getPartyreferencedatadirectoryid() {
        return partyreferencedatadirectoryid;
    }

    public void setAssociationsid(String associationsid) {
        this.associationsid = associationsid;
    }

    public String getAssociationsid() {
        return associationsid;
    }

    public void setAssociations(org.museframework.bian.parrefdatdir.dto.bq.Associations associations) {
        this.associations = associations;
    }

    public org.museframework.bian.parrefdatdir.dto.bq.Associations getAssociations() {
        return associations;
    }
}