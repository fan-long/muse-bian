package org.museframework.bian.legentdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateProfileRequest {
    @MetaField
    private String legalentitydirectoryid;

    @MetaField
    private String profileid;

    @MetaField(ref=true)
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