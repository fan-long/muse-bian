package org.museframework.bian.legentdir.dto;

public class UpdateAssociationsRequest {
    private String legalentitydirectoryid;

    private String associationsid;

    private org.museframework.bian.legentdir.dto.bq.Associations associations;

    public void setLegalentitydirectoryid(String legalentitydirectoryid) {
        this.legalentitydirectoryid = legalentitydirectoryid;
    }

    public String getLegalentitydirectoryid() {
        return legalentitydirectoryid;
    }

    public void setAssociationsid(String associationsid) {
        this.associationsid = associationsid;
    }

    public String getAssociationsid() {
        return associationsid;
    }

    public void setAssociations(org.museframework.bian.legentdir.dto.bq.Associations associations) {
        this.associations = associations;
    }

    public org.museframework.bian.legentdir.dto.bq.Associations getAssociations() {
        return associations;
    }
}