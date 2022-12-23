package org.museframework.bian.archiveservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ControlArchiveOperatingSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.archiveservices.dto.cr.ArchiveOperatingSession archiveOperatingSession;

    public void setArchiveOperatingSession(org.museframework.bian.archiveservices.dto.cr.ArchiveOperatingSession archiveOperatingSession) {
        this.archiveOperatingSession = archiveOperatingSession;
    }

    public org.museframework.bian.archiveservices.dto.cr.ArchiveOperatingSession getArchiveOperatingSession() {
        return archiveOperatingSession;
    }
}