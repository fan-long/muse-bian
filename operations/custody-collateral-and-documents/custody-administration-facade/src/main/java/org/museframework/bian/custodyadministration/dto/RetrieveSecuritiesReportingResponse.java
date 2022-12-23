package org.museframework.bian.custodyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveSecuritiesReportingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.custodyadministration.dto.bq.SecuritiesReporting securitiesReporting;

    public void setSecuritiesReporting(org.museframework.bian.custodyadministration.dto.bq.SecuritiesReporting securitiesReporting) {
        this.securitiesReporting = securitiesReporting;
    }

    public org.museframework.bian.custodyadministration.dto.bq.SecuritiesReporting getSecuritiesReporting() {
        return securitiesReporting;
    }
}