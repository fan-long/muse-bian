package org.museframework.bian.legentdir.dto;

public class RetrieveProfileResponse {
    private org.museframework.bian.legentdir.dto.bq.Profile profile;

    public void setProfile(org.museframework.bian.legentdir.dto.bq.Profile profile) {
        this.profile = profile;
    }

    public org.museframework.bian.legentdir.dto.bq.Profile getProfile() {
        return profile;
    }
}