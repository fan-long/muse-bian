package org.museframework.bian.secposkee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateSecuritiesPositionLogResponse {
    @MetaField(ref=true)
    private org.museframework.bian.secposkee.dto.cr.SecuritiesPositionLog securitiesPositionLog;

    public void setSecuritiesPositionLog(org.museframework.bian.secposkee.dto.cr.SecuritiesPositionLog securitiesPositionLog) {
        this.securitiesPositionLog = securitiesPositionLog;
    }

    public org.museframework.bian.secposkee.dto.cr.SecuritiesPositionLog getSecuritiesPositionLog() {
        return securitiesPositionLog;
    }
}