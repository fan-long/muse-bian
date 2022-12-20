package org.museframework.bian.legentdir.dto;

public class UpdateProfileRequest {
    private String legalentitydirectoryid;

    private String profileid;

    private org.museframework.bian.legentdir.dto.bq.Profile profile;

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

    public void setProfile(org.museframework.bian.legentdir.dto.bq.Profile profile) {
        this.profile = profile;
    }

    public org.museframework.bian.legentdir.dto.bq.Profile getProfile() {
        return profile;
    }
}