package org.museframework.bian.legentdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateProfileResponse {
    @MetaField(ref=true)
    private org.museframework.bian.legentdir.dto.bq.Profile profile;

    public void setProfile(org.museframework.bian.legentdir.dto.bq.Profile profile) {
        this.profile = profile;
    }

    public org.museframework.bian.legentdir.dto.bq.Profile getProfile() {
        return profile;
    }
}