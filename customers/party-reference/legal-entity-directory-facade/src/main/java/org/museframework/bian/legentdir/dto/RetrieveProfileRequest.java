package org.museframework.bian.legentdir.dto;

public class RetrieveProfileRequest {
    private String legalentitydirectoryid;

    private String profileid;

    public void setLegalentitydirectoryid(String legalentitydirectoryid) {
        this.legalentitydirectoryid = legalentitydirectoryid;
    }

    public String getLegalentitydirectoryid() {
        return legalentitydirectoryid;
    }

    public void setProfileid(String profileid) {
        this.profileid = profileid;
    }

    public String getProfileid() {
        return profileid;
    }
}