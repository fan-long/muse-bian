package org.museframework.bian.legentdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProfileRequest {
    @MetaField
    private String legalentitydirectoryid;

    @MetaField
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