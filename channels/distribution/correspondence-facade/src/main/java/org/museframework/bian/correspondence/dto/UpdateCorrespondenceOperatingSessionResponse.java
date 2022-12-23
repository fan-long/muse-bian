package org.museframework.bian.correspondence.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCorrespondenceOperatingSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.correspondence.dto.cr.CorrespondenceOperatingSession correspondenceOperatingSession;

    public void setCorrespondenceOperatingSession(org.museframework.bian.correspondence.dto.cr.CorrespondenceOperatingSession correspondenceOperatingSession) {
        this.correspondenceOperatingSession = correspondenceOperatingSession;
    }

    public org.museframework.bian.correspondence.dto.cr.CorrespondenceOperatingSession getCorrespondenceOperatingSession() {
        return correspondenceOperatingSession;
    }
}