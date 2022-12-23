package org.museframework.bian.corbanope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteCorrespondentBankOperatingSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corbanope.dto.cr.CorrespondentBankOperatingSession correspondentBankOperatingSession;

    public void setCorrespondentBankOperatingSession(org.museframework.bian.corbanope.dto.cr.CorrespondentBankOperatingSession correspondentBankOperatingSession) {
        this.correspondentBankOperatingSession = correspondentBankOperatingSession;
    }

    public org.museframework.bian.corbanope.dto.cr.CorrespondentBankOperatingSession getCorrespondentBankOperatingSession() {
        return correspondentBankOperatingSession;
    }
}