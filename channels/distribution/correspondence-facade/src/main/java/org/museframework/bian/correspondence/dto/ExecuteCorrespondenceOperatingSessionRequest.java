package org.museframework.bian.correspondence.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteCorrespondenceOperatingSessionRequest {
    @MetaField
    private String correspondenceid;

    @MetaField(ref=true)
    private org.museframework.bian.correspondence.dto.cr.CorrespondenceOperatingSession correspondenceOperatingSession;

    public void setCorrespondenceid(String correspondenceid) {
        this.correspondenceid = correspondenceid;
    }

    public String getCorrespondenceid() {
        return correspondenceid;
    }

    public void setCorrespondenceOperatingSession(org.museframework.bian.correspondence.dto.cr.CorrespondenceOperatingSession correspondenceOperatingSession) {
        this.correspondenceOperatingSession = correspondenceOperatingSession;
    }

    public org.museframework.bian.correspondence.dto.cr.CorrespondenceOperatingSession getCorrespondenceOperatingSession() {
        return correspondenceOperatingSession;
    }
}