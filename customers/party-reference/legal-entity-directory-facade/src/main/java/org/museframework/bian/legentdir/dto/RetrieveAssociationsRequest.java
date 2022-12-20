package org.museframework.bian.legentdir.dto;

public class RetrieveAssociationsRequest {
    private String legalentitydirectoryid;

    private String associationsid;

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
}